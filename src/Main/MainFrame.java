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

        buyTicket = new BuyTicket();
        buyTicket.setLocation(0, 0);
        buyTicket.setVisible(false);
        add(buyTicket);

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
