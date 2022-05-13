package UserMenu;

import Database.Package;
import Frames.Login;
import Main.Main;
import Main.MainFrame;
import Class.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindTrainTicket extends Container {
    public static JTextArea textArea;
    public static Ticket ticket;
    public FindTrainTicket(){
        setSize(600, 400);
        setLayout(null);

        String[] typeMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        String[] typeChoose = {"Compartment", "ReservedSeat"};

        JLabel whereFromLabel = new JLabel("Where from");
        whereFromLabel.setBounds(50, 50, 70, 30);
        add(whereFromLabel);

        JTextField whereFromField = new JTextField();
        whereFromField.setBounds(130, 50, 100, 30);
        add(whereFromField);

        JLabel whereLabel = new JLabel("Where");
        whereLabel.setBounds(50, 90, 70, 30);
        add(whereLabel);

        JTextField whereField = new JTextField();
        whereField.setBounds(130, 90, 100, 30);
        add(whereField);

        JLabel monthLabel = new JLabel("Month");
        monthLabel.setBounds(50, 130, 70, 30);
        add(monthLabel);

        JComboBox typeMonthBox = new JComboBox(typeMonth);
        typeMonthBox.setBounds(130, 130, 100, 30);
        add(typeMonthBox);

        JLabel dayLabel = new JLabel("Day");
        dayLabel.setBounds(50, 170, 70, 30);
        add(dayLabel);

        JTextField dayField = new JTextField();
        dayField.setBounds(130, 170, 100, 30);
        add(dayField);

        JLabel chooseLabel = new JLabel("Choose");
        chooseLabel.setBounds(50, 210, 70, 30);
        add(chooseLabel);

        JComboBox chooseBox = new JComboBox(typeChoose);
        chooseBox.setBounds(130, 210, 100, 30);
        add(chooseBox);

        JButton findButton = new JButton("Find");
        findButton.setBounds(50, 250, 180, 30);
        add(findButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(50, 290, 180, 30);
        add(backButton);

        textArea = new JTextArea();
        textArea.setBounds(250, 50, 300, 190);
        add(textArea);

        JLabel label = new JLabel("Enter the ticket number you want to buy");
        label.setBounds(250, 250, 230, 30);
        add(label);

        JTextField numberField = new JTextField();
        numberField.setBounds(485, 250, 65, 30);
        add(numberField);

        JButton buyButton = new JButton("BUY");
        buyButton.setBounds(250, 290, 300, 30);
        add(buyButton);

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TrainTicket trainTicket = new TrainTicket(null, null, whereFromField.getText(),  whereField.getText(),
                        0, Integer.parseInt(dayField.getText()), (String)typeMonthBox.getSelectedItem(), 0, (String)chooseBox.getSelectedItem());

                Package pd = new Package("FIND TRAIN", trainTicket );
                Main.connect(pd);
            }
        });

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!numberField.getText().equals( "" )) {
                    Package pd3 = new Package("GET TICKET", Integer.parseInt(numberField.getText()));
                    Main.connect(pd3);

                    Package pd2 = new Package("ADD CARD", Login.customer.getId(), ticket.getName(), ticket.getWhereFrom(), ticket.getWhere(), ticket.getDay(), ticket.getMonth(), ticket.getPlace());
                    Main.connect(pd2);
                    Package pd = new Package("DELETE TICKET", Integer.parseInt(numberField.getText()));
                    Main.connect(pd);

                    textArea.setText(null);
                    numberField.setText(null);
                }
                else{
                    JOptionPane.showInternalMessageDialog(null, "Fields are null");
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.findTrainTicket.setVisible(false);
                MainFrame.userMenu.setVisible(true);
            }
        });
    }
}
