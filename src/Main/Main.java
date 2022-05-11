package Main;
import AdminMenu.AdminMenu;
import Database.*;
import Database.Package;
import Class.*;
import UserMenu.FindPlaneTicket;
import UserMenu.FindTrainTicket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Main {
    public static MainFrame frame;

    public static void connect(Package pd){
        try{
            Socket socket = new Socket("127.0.0.1", 5000);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            if(pd.getOperationType().equals("ADD CUSTOMER")){
                outputStream.writeObject(pd);
            }
            else if (pd.getOperationType().equals("ADD TRAIN TICKET")) {
                outputStream.writeObject(pd);

            }
            else if (pd.getOperationType().equals("ADD PLANE TICKET")) {
                outputStream.writeObject(pd);

            }
            else if(pd.getOperationType().equals("LIST TRAIN")){
                outputStream.writeObject(pd);
                Package infoFromServer = (Package)inputStream.readObject();
                ArrayList<TrainTicket> arrayListFromServer = infoFromServer.getTrainTickets();
                String s = "";

                for(int i=0; i< arrayListFromServer.size(); i++){
                    s += arrayListFromServer.get(i).info()+ "\n";
                }
                AdminMenu.textArea.setText(s);
            }
            else if(pd.getOperationType().equals("LIST PLANE")){
                outputStream.writeObject(pd);
                Package infoFromServer = (Package)inputStream.readObject();
                ArrayList<PlaneTicket> arrayListFromServer = infoFromServer.getPlaneTickets();
                String s = "";

                for(int i=0; i< arrayListFromServer.size(); i++){
                    s += arrayListFromServer.get(i).info()+ "\n";
                }
                AdminMenu.textArea.setText(s);
            }
            else if(pd.getOperationType().equals("FIND TRAIN")){
                outputStream.writeObject(pd);
                Package infoFromServer = (Package)inputStream.readObject();
                ArrayList<TrainTicket> arrayListFromServer = infoFromServer.getTrainTickets();
                String s = "";

                for(int i=0; i< arrayListFromServer.size(); i++){
                    s += arrayListFromServer.get(i).info()+ "\n";
                }
                FindTrainTicket.textArea.setText(s);
            }
            else if(pd.getOperationType().equals("FIND PLANE")){
                outputStream.writeObject(pd);
                Package infoFromServer = (Package)inputStream.readObject();
                ArrayList<PlaneTicket> arrayListFromServer = infoFromServer.getPlaneTickets();
                String s = "";

                for(int i=0; i< arrayListFromServer.size(); i++){
                    s += arrayListFromServer.get(i).info()+ "\n";
                }
                FindPlaneTicket.textArea.setText(s);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);

    }
}
