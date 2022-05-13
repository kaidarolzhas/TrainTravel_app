package UserMenu;
import Main.*;
import Database.Package;
import Frames.Login;
import Main.MainFrame;
import com.mysql.cj.log.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserMenu extends Container {
    public static JTextArea textArea;
    public UserMenu(){
        setSize(600, 400);
        setLayout(null);

        JButton findTrainButton = new JButton("Find train ticket");
        findTrainButton.setBounds(100, 50, 400, 25);
        add(findTrainButton);

        JButton findPlaneButton = new JButton("Find plane ticket");
        findPlaneButton.setBounds(100, 80, 400, 25);
        add(findPlaneButton);

        JButton myTicketsButton = new JButton("My tickets");
        myTicketsButton.setBounds(100, 110, 400, 25);
        add(myTicketsButton);

        textArea = new JTextArea();
        textArea.setBounds(100, 140, 400, 130);
        add(textArea);
        textArea.setText(null);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(100, 275, 400, 25);
        add(backButton);

        findTrainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.userMenu.setVisible(false);
                MainFrame.findTrainTicket.setVisible(true);
            }
        });

        findPlaneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.userMenu.setVisible(false);
                MainFrame.findPlaneTicket.setVisible(true);
            }
        });

        myTicketsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Package pd = new Package("LIST CARD", Login.customer.getId());
                Main.connect(pd);

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.userMenu.setVisible(false);
                MainFrame.mainMenu.setVisible(true);
            }
        });
    }
}
