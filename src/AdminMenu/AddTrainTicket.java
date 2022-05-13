package AdminMenu;
import Class.TrainTicket;
import Database.Package;
import Main.Main;
import Main.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTrainTicket extends Container {
    public AddTrainTicket(){
        setSize(600, 400);
        setLayout(null);

        String[] typeTrain = {"Compartment", "ReservedSeat"};

        String[] typeMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        JLabel whereFromLabel = new JLabel("Where from");
        whereFromLabel.setBounds(50, 100, 95, 30);
        add(whereFromLabel);

        JLabel whereLabel = new JLabel("Where");
        whereLabel.setBounds(150, 100, 95, 30);
        add(whereLabel);

        JLabel monthLabel = new JLabel("Month");
        monthLabel.setBounds(250, 100, 95, 30);
        add(monthLabel);

        JLabel dayLabel = new JLabel("Day");
        dayLabel.setBounds(350, 100, 95, 30);
        add(dayLabel);

        JLabel priceLabel = new JLabel("Price");
        priceLabel.setBounds(450, 100, 95, 30);
        add(priceLabel);

        JTextField whereFromField = new JTextField();
        whereFromField.setBounds(50, 150, 95, 30);
        add(whereFromField);

        JTextField whereField = new JTextField();
        whereField.setBounds(150, 150, 95, 30);
        add(whereField);

        JComboBox typeMonthField = new JComboBox(typeMonth);
        typeMonthField.setBounds(250, 150, 95, 30);
        add(typeMonthField);

        JTextField priceField = new JTextField();
        priceField.setBounds(450, 150, 95, 30);
        add(priceField);

        JTextField dayField = new JTextField();
        dayField.setBounds(350, 150, 95, 30);
        add(dayField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 200, 95, 30);
        add(nameLabel);

        JComboBox typeTrainField = new JComboBox(typeTrain);
        typeTrainField.setBounds(150, 200, 95, 30);
        add(typeTrainField);

        JLabel placeLabel = new JLabel("Place:");
        placeLabel.setBounds(50, 300, 95, 30);
        add(placeLabel);

        JTextField placeField = new JTextField();
        placeField.setBounds(450, 300, 95, 30);
        add(placeField);

        String name = "Kazakhstan";

        JButton findButton = new JButton("Add");
        findButton.setBounds(450, 200, 95, 30);
        add(findButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(300, 200, 150, 30);
        add(backButton);

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TrainTicket trainTicket = new TrainTicket(
                        null,name, whereFromField.getText(),
                        whereField.getText(), Integer.parseInt(priceField.getText()),Integer.parseInt(dayField.getText()),
                        (String)typeMonthField.getSelectedItem(),Integer.parseInt(placeField.getText()),(String)typeTrainField.getSelectedItem()
                );
                Package pd = new Package("ADD TRAIN TICKET", trainTicket);
                Main.connect(pd);

                whereFromField.setText(null);
                whereField.setText(null);
                priceField.setText(null);
                dayField.setText(null);
                placeField.setText(null);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.addTrainTicket.setVisible(false);
                MainFrame.adminMenu.setVisible(true);
            }
        });
    }
}
