package AdminMenu;

import Main.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMenu extends Container {
    public AdminMenu(){

        setSize(600, 400);
        setLayout(null);


        JButton TrainButton = new JButton("Find train ticket");
        TrainButton.setBounds(100, 50, 400, 25);
        add(TrainButton);

        JButton PlaneButton = new JButton("Find plane ticket");
        PlaneButton.setBounds(100, 80, 400, 25);
        add(PlaneButton);

        JButton back = new JButton("Back");
        back.setBounds(100, 110, 400, 25);
        add(back);


        TrainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.addTrainTicket.setVisible(true);
                MainFrame.adminMenu.setVisible(false);

            }
        });

        PlaneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.addPlaneTicket.setVisible(true);
                MainFrame.adminMenu.setVisible(false);

            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.mainMenu.setVisible(true);
                MainFrame.adminMenu.setVisible(false);

            }
        });
    }



}
