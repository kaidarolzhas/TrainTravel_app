package AdminMenu;
import Main.Main;
import Database.Package;
import Main.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMenu extends Container {
    public static JTextArea textArea;
    public AdminMenu(){
        setSize(600, 400);
        setLayout(null);

        JButton TrainButton = new JButton("Add train ticket");
        TrainButton.setBounds(75, 20, 400, 25);
        add(TrainButton);

        JButton PlaneButton = new JButton("Add plane ticket");
        PlaneButton.setBounds(75, 50, 400, 25);
        add(PlaneButton);

        JButton back = new JButton("Back");
        back.setBounds(75, 80, 400, 25);
        add(back);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBounds(75,120,400,200);
        add(textArea);

        JButton trainList = new JButton("List Train");
        trainList.setBounds(75, 325, 100, 25);
        add(trainList);

        JButton planeList = new JButton("List Plane");
        planeList.setBounds(375, 325, 100, 25);
        add(planeList);

        planeList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);
                Package pd = new Package("LIST PLANE");
                Main.connect(pd);
            }
        });

        trainList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);
                Package pd = new Package("LIST TRAIN");
                Main.connect(pd);
            }
        });

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