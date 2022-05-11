package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Class.*;

public class DBManager {
    public static Connection connection = null;

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/tannurdb?useUnicode=true&serverTimezone=UTC", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean checkCustomer(String customerLogin, String customer_password) {
        boolean check = false;
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT * FROM customer WHERE login = '" + customerLogin + "'" + "and password = '" + customer_password + "'");
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                check = true;
            }


            statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return check;
    }



    public void addCustomer(Customer customer) {
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO customer (id, name, surname, login, password) " +
                    "VALUES (NULL, ?, ?, ?, ?)");
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getSurname());
            statement.setString(3, customer.getLogin());
            statement.setString(4, customer.getPassword());

            statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addTicket(Ticket ticket) {
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO ticket (id, whereFrom, where, price, day, month) " +
                    "VALUES (NULL, ?, ?, ?, ?, ?)");
            statement.setString(1, ticket.getWhereFrom());
            statement.setString(2, ticket.getWhere());
            statement.setInt(3, ticket.getPrice());
            statement.setInt(4, ticket.getDay());
            statement.setString(5, ticket.getMonth());

            statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Customer> getAllCustomer(){
        ArrayList<Customer> customerList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM customer");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                customerList.add(new Customer(id, name, surname, login, password));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return customerList;
    }

    public ArrayList<Ticket> getAllTicket(){
        ArrayList<Ticket> ticketList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM ticket");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String whereFrom = resultSet.getString("whereFrom");
                String where = resultSet.getString("where");
                int price = resultSet.getInt("price");
                int day = resultSet.getInt("day");
                String month = resultSet.getString("month");
                ticketList.add(new Ticket(id, whereFrom, where, price, day, month));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ticketList;
    }
}
