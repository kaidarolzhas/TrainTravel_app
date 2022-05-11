package UserMenu;
import Main.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserMenu extends Container {
    public static JTextArea textArea;
    public UserMenu(){
        setSize(600, 400);
        setLayout(null);

        JButton buyTicketButton = new JButton("Buy ticket");
        buyTicketButton.setBounds(100, 50, 400, 30);
        add(buyTicketButton);

        JButton myTicketsButton = new JButton("My tickets");
        myTicketsButton.setBounds(100, 90, 400, 30);
        add(myTicketsButton);

        textArea = new JTextArea();
        textArea.setBounds(100, 130, 400, 130);
        add(textArea);
        textArea.setText(null);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(100, 270, 400, 30);
        add(backButton);

        buyTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.userMenu.setVisible(false);
                MainFrame.buyTicket.setVisible(true);
            }
        });

        myTicketsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
