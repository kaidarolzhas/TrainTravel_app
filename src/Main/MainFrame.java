package Main;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu mainMenu;
    public MainFrame(){
        setSize(600, 400);
        setTitle("Train Travel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        mainMenu = new MainMenu();
        mainMenu.setLocation(0, 0);
        add(mainMenu);


    }
}
