package Frames;

import javax.swing.*;
import Database.Package;
import Main.Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static Database.DBManager.connection;

public class Login extends Container {
    public Login(){

        setSize(600,400);
        setLayout(null);


        JLabel loginLabel = new JLabel("LOGIN:");
        loginLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        loginLabel.setBounds(100, 150, 100, 30);
        add(loginLabel);

        JTextField loginField = new JTextField();
        loginField.setBounds(200, 150, 200, 30);
        add(loginField);



        JLabel passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        passwordLabel.setBounds(100, 200, 100, 30);
        add(passwordLabel);


        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(200, 200, 200, 30);
        add(passwordField);



        JButton logInButton = new JButton("LOG IN");
        logInButton.setFont(new Font("Verdana", Font.BOLD , 12));
        logInButton.setBounds(100, 250, 145, 30);
        add(logInButton);


        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Verdana", Font.BOLD , 12));
        backButton.setBounds(100, 300, 300, 30);
        add(backButton);


        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    PreparedStatement statement = connection.prepareStatement("" +
                            "SELECT * FROM customer WHERE login = '" + loginField.getText() + "'" + "and password = '" + passwordField.getText() + "'");
                    ResultSet resultSet = statement.executeQuery();
                    if(resultSet.next()){
                        Main.frame.login.setVisible(false);
                        Main.frame.signup.setVisible(true);


                    }

                }catch (Exception a){
                    a.printStackTrace();
                }


            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.login.setVisible(false);
                Main.frame.mainMenu.setVisible(true);
            }
        });


    }
}
