package AdminMenu;

import Database.Package;
import Main.*;
import Class.PlaneTicket;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPlaneTicket extends Container {
    public AddPlaneTicket(){
        setSize(600, 400);
        setLayout(null);

        String[] Name= {"Fly Arystan", "Fly Astana"};

        String[] Luggage= {"Yes", "No"};

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

        JLabel LuggageLabel = new JLabel("Luggage:");
        LuggageLabel.setBounds(50, 200, 95, 30);
        add(LuggageLabel);

        JComboBox LuggageField = new JComboBox(Luggage);
        LuggageField.setBounds(150, 200, 95, 30);
        add(LuggageField);

        JLabel placeLabel = new JLabel("Place:");
        placeLabel.setBounds(50, 200, 95, 30);
        add(placeLabel);

        JTextField placeField = new JTextField();
        placeField.setBounds(200, 300, 95, 30);
        add(placeField);

        JLabel NameLabel = new JLabel("Name:");
        NameLabel.setBounds(50, 250, 95, 30);
        add(NameLabel);

        JComboBox NameField = new JComboBox(Name);
        NameField.setBounds(150, 250, 95, 30);
        add(NameField);


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
                /*

                PlaneTicket trainTicket = new PlaneTicket(
                        null,name, whereFromField.getText(),
                        whereField.getText(), Integer.parseInt(priceField.getText()),Integer.parseInt(dayField.getText()),(String)typeMonthField.getSelectedItem(),Integer.parseInt(placeField.getText())
                );
                /*
                Package pd = new Package("ADD TRAIN TICKET", PlaneTicket);
                Main.connect(pd);

                 */



            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.addPlaneTicket.setVisible(false);
                MainFrame.adminMenu.setVisible(true);
            }
        });
    }


    }


