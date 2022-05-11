package Main;

import UserMenu.BuyTicket;
import UserMenu.UserMenu;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu mainMenu;
    public static BuyTicket buyTicket;
    public static UserMenu userMenu;
    public MainFrame(){
        setSize(600, 400);
        setTitle("Train Travel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        mainMenu = new MainMenu();
        mainMenu.setLocation(0, 0);
        mainMenu.setVisible(true);
        add(mainMenu);

        buyTicket = new BuyTicket();
        buyTicket.setLocation(0, 0);
        buyTicket.setVisible(false);
        add(buyTicket);

        userMenu = new UserMenu();
        userMenu.setLocation(0, 0);
        userMenu.setVisible(false);
        add(userMenu);
    }
}
