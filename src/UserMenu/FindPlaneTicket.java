package UserMenu;
import Database.Package;
import Main.Main;
import Main.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Class.*;

public class FindPlaneTicket extends Container {
    public static JTextArea textArea;
    public FindPlaneTicket(){
        setSize(600, 400);
        setLayout(null);

        String[] typeMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        String[] typeLuggage = {"true", "false"};

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

        JLabel luggageLabel = new JLabel("Luggage");
        luggageLabel.setBounds(50, 210, 70, 30);
        add(luggageLabel);

        JComboBox luggageBox = new JComboBox(typeLuggage);
        luggageBox.setBounds(130, 210, 100, 30);
        add(luggageBox);

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
                PlaneTicket trainTicket = new PlaneTicket(null, whereFromField.getText(),  whereField.getText(),
                        Integer.parseInt(dayField.getText()), (String)typeMonthBox.getSelectedItem(), (String)luggageBox.getSelectedItem());

                Package pd = new Package("FIND PLANE", trainTicket );
                Main.connect(pd);
            }
        });

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.findPlaneTicket.setVisible(false);
                MainFrame.userMenu.setVisible(true);
            }
        });
    }
}
