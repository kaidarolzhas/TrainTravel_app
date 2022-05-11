package Main;

import Frames.Login;
import Frames.Signup;
import UserMenu.BuyTicket;
import UserMenu.UserMenu;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu mainMenu;
    public static BuyTicket buyTicket;
    public static UserMenu userMenu;
    public static Login login;
    public static Signup signup;
    public MainFrame(){
        setSize(600, 400);
        setTitle("Train Travel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        mainMenu = new MainMenu();
        mainMenu.setLocation(0, 0);
        add(mainMenu);

        login = new Login();
        login.setVisible(false);
        login.setLocation(0, 0);
        add(login);

        signup = new Signup();
        signup.setVisible(false);
        signup.setLocation(0, 0);
        add(signup);

        buyTicket = new BuyTicket();
        buyTicket.setVisible(false);
        buyTicket.setLocation(0, 0);
        add(buyTicket);


        userMenu = new UserMenu();
        userMenu.setVisible(false);
        userMenu.setLocation(0, 0);
        add(userMenu);



    }
}
