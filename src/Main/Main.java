package Main;
import Database.*;
import Database.Package;

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


        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);

    }
}
