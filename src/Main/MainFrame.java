package Main;

import Frames.Login;
import Frames.Signup;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu mainMenu;
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


    }
}
