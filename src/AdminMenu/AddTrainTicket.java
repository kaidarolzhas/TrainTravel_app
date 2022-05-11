package AdminMenu;
import Class.TrainTicket;
import Database.Package;
import Main.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTrainTicket extends Container {
    public AddTrainTicket(){

        setSize(600, 400);
        setLayout(null);

        String[] typeTrain = {"Kupe", "Talgo"};

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

        JComboBox typeTrainField = new JComboBox(typeMonth);
        typeTrainField.setBounds(350, 150, 95, 30);
        add(typeTrainField);

        JTextField dayField = new JTextField();
        dayField.setBounds(350, 150, 95, 30);
        add(dayField);

        JButton findButton = new JButton("Add");
        findButton.setBounds(450, 200, 95, 30);
        add(findButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(50, 200, 150, 30);
        add(backButton);

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                TrainTicket trainTicket = new TrainTicket(null,)
                Package pd = new Package("ADD TRAIN TICKET", );

                 */

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
