package Main;

import AdminMenu.*;
import Frames.Login;
import Frames.Signup;
import UserMenu.FindTrainTicket;
import UserMenu.FindPlaneTicket;
import UserMenu.UserMenu;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static AdminMenu adminMenu;
    public static MainMenu mainMenu;
    public static FindTrainTicket findTrainTicket;
    public static FindPlaneTicket findPlaneTicket;
    public static UserMenu userMenu;
    public static Login login;
    public static Signup signup;
    public static AddPlaneTicket addPlaneTicket;
    public static AddTrainTicket addTrainTicket;
    public MainFrame(){
        setSize(600, 400);
        setTitle("Train Travel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        mainMenu = new MainMenu();
        mainMenu.setLocation(0, 0);
        add(mainMenu);

        addPlaneTicket = new AddPlaneTicket();
        addPlaneTicket.setLocation(0,0);
        addPlaneTicket.setVisible(false);
        add(addPlaneTicket);

        addTrainTicket = new AddTrainTicket();
        addTrainTicket.setLocation(0,0);
        addTrainTicket.setVisible(false);
        add(addTrainTicket);


        adminMenu = new AdminMenu();
        adminMenu.setLocation(0, 0);
        adminMenu.setVisible(false);
        add(adminMenu);

        findTrainTicket = new FindTrainTicket();
        findTrainTicket.setLocation(0, 0);
        findTrainTicket.setVisible(false);
        add(findTrainTicket);

        findPlaneTicket = new FindPlaneTicket();
        findPlaneTicket.setLocation(0, 0);
        findPlaneTicket.setVisible(false);
        add(findPlaneTicket);

        userMenu = new UserMenu();
        userMenu.setLocation(0, 0);
        userMenu.setVisible(false);
        add(userMenu);

        login = new Login();
        login.setLocation(0, 0);
        login.setVisible(false);
        add(login);

        signup = new Signup();
        signup.setLocation(0, 0);
        signup.setVisible(false);
        add(signup);
    }
}
