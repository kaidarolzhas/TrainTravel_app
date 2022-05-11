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
                else if(data.getOperationType().equals("Find Plane")){
                    //ArrayList<PlaneTicket> arrayPercussion = manager.findPlaneTicket(data.getPlaneTickets());
                    Package toPercussion = new Package();
                    //toPercussion.setPercussionInstruments(arrayPercussion);
                    outputStream.writeObject(toPercussion);
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
