package Frames;

import Main.Main;
import Database.Package;
import Class.Customer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends Container {
    public Signup(){

        setSize(500, 500);
        setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(50, 50, 100, 100);
        add(label);

        JLabel nameLabel = new JLabel("NAME:");
        nameLabel.setFont(new Font("Courier New", Font.PLAIN, 14));
        nameLabel.setBounds(100, 50, 100, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 50, 200, 30);
        add(nameField);

        JLabel surnameLabel = new JLabel("SURNAME:");
        surnameLabel.setFont(new Font("Courier New", Font.PLAIN, 14));
        surnameLabel.setBounds(100, 100, 100, 30);
        add(surnameLabel);

        JTextField surnameField = new JTextField();
        surnameField.setBounds(200, 100, 200, 30);
        add(surnameField);

        JLabel loginLabel = new JLabel("LOGIN:");
        loginLabel.setFont(new Font("Courier New", Font.PLAIN, 14));
        loginLabel.setBounds(100, 150, 100, 30);
        add(loginLabel);

        JTextField loginField = new JTextField();
        loginField.setBounds(200, 150, 200, 30);
        add(loginField);

        JLabel passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setFont(new Font("Courier New", Font.PLAIN, 14));
        passwordLabel.setBounds(100, 200, 100, 30);
        add(passwordLabel);

        JLabel tip = new JLabel("(password must have digit, one lowercase and one capital letter)");
        tip.setFont(new Font("Serif", Font.BOLD , 12));
        tip.setBounds(100, 275, 400, 30);
        add(tip);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(200, 200, 200, 30);
        add(passwordField);

        JLabel passwordLabel2 = new JLabel("REPEAT:");
        passwordLabel2.setFont(new Font("Courier New", Font.PLAIN, 12));
        passwordLabel2.setBounds(100, 250, 200, 30);
        add(passwordLabel2);

        JTextField passwordField2 = new JTextField();
        passwordField2.setBounds(200, 250, 200, 30);
        add(passwordField2);

        JButton singButton = new JButton("Sing up");
        singButton.setFont(new Font("Verdana", Font.BOLD, 12));
        singButton.setBounds(100, 325, 140, 40);
        add(singButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setFont(new Font("Verdana", Font.BOLD, 12));
        backButton.setBounds(250, 325, 150, 40);
        add(backButton);

        singButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer new_customer = new Customer(null, loginField.getText(), passwordField.getText(), nameField.getText(), surnameField.getText());
                Package packageData = new Package("ADD CUSTOMER", new_customer);
                Main.connect(packageData);
                JOptionPane.showInternalMessageDialog(null,"SUCCESSFUL");

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.signup.setVisible(false);
                Main.frame.mainMenu.setVisible(true);
            }
        });

    }
}
