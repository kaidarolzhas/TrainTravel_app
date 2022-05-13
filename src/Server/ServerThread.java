package Server;
import Class.Customer;
import Database.DBManager;
import Database.Package;
import Class.TrainTicket;
import Class.PlaneTicket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import Class.*;


public class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        try{
            DBManager manager = new DBManager();
            manager.connect();

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            Package data = null;

            while((data = ((Package)inputStream.readObject())) != null) {
                if (data.getOperationType().equals("ADD CUSTOMER")) {
                    Customer customer = data.getCustomer();
                    manager.addCustomer(customer);
                    break;
                } else if (data.getOperationType().equals("ADD TRAIN TICKET")) {
                    TrainTicket trainTicket = data.getTrainTicket();
                    manager.addTrainTicket(trainTicket);
                    break;
                    
                }
                else if (data.getOperationType().equals("ADD PLANE TICKET")) {
                    PlaneTicket planeTicket = data.getPlaneTicket();
                    manager.addPlaneTicket(planeTicket);
                    break;

                }
                else if (data.getOperationType().equals("ADD CARD")) {
                    manager.addCard(data.getId(), data.getLogin(), data.getWhereFrom(), data.getWheree(), data.getDay(), data.getMonth(), data.getPlace());
                    break;

                }
                else if(data.getOperationType().equals("LIST TRAIN")){
                    ArrayList<TrainTicket> arrayTrain = manager.getAllTrainTicket();
                    Package trainList = new Package();
                    trainList.setTrainTickets(arrayTrain);
                    outputStream.writeObject(trainList);
                    break;
                }

                else if(data.getOperationType().equals("LIST PLANE")){
                    ArrayList<PlaneTicket> arrayPlane = manager.getAllPlaneTicket();
                    Package planeList = new Package();
                    planeList.setPlaneTickets(arrayPlane);
                    outputStream.writeObject(planeList);
                    break;
                }
                else if(data.getOperationType().equals("FIND TRAIN")){
                    ArrayList<TrainTicket> arrayTrain = manager.findTrainTicket(data.getTrainTicket());
                    Package trainList = new Package();
                    trainList.setTrainTickets(arrayTrain);
                    outputStream.writeObject(trainList);
                    break;
                }
                else if(data.getOperationType().equals("FIND PLANE")){
                    ArrayList<PlaneTicket> arrayPlane = manager.findPlaneTicket(data.getPlaneTicket());
                    Package planeList = new Package();
                    planeList.setPlaneTickets(arrayPlane);
                    outputStream.writeObject(planeList);
                    break;
                }
                else if(data.getOperationType().equals("DELETE TICKET")){
                    int idTicket = data.getId();
                    manager.deleteTicket(idTicket);
                    break;
                }
                else if(data.getOperationType().equals("GET CUSTOMER")){
                    Customer customer = manager.getCustomer(data.getLogin());
                    Package toPercussion = new Package(customer);
                    outputStream.writeObject(toPercussion);
                    break;
                }
                else if(data.getOperationType().equals("GET TICKET")){
                    Ticket customer = manager.getTicket(data.getId());
                    Package toPercussion = new Package(customer);
                    outputStream.writeObject(toPercussion);
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
