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
                    "jdbc:mysql://localhost:3306/bd_olzhas?useUnicode=true&serverTimezone=UTC", "root", "");
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





    public void addPlaneTicket(PlaneTicket planeTicket) {
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO ticket (id, name, whereFrom, wheree, price, day, month, place, luggage, typeID) " +
                    "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, planeTicket.getName());
            statement.setString(2, planeTicket.getWhereFrom());
            statement.setString(3, planeTicket.getWhere());
            statement.setInt(4, planeTicket.getPrice());
            statement.setInt(5, planeTicket.getDay());
            statement.setString(6, planeTicket.getMonth());
            statement.setInt(7, planeTicket.getPlace());
            statement.setString(8, planeTicket.getLuggage());
            statement.setInt(9, 2);

            statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addTrainTicket(TrainTicket trainTicket) {
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO ticket (id, name, whereFrom, wheree, price, day, month, place, type, typeID) " +
                    "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, trainTicket.getName());
            statement.setString(2, trainTicket.getWhereFrom());
            statement.setString(3, trainTicket.getWhere());
            statement.setInt(4, trainTicket.getPrice());
            statement.setInt(5, trainTicket.getDay());
            statement.setString(6, trainTicket.getMonth());
            statement.setInt(7, trainTicket.getPlace());
            statement.setString(8, trainTicket.getType());
            statement.setInt(9, 1);

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

    public ArrayList<PlaneTicket> getAllPlaneTicket(){
        ArrayList<PlaneTicket> ticketList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM ticket WHERE typeID=2");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String whereFrom = resultSet.getString("whereFrom");
                String where = resultSet.getString("wheree");
                int price = resultSet.getInt("price");
                int day = resultSet.getInt("day");
                String month = resultSet.getString("month");
                int place = resultSet.getInt("place");
                String lugguage = resultSet.getString("luggage");
                ticketList.add(new PlaneTicket(id, name,whereFrom, where, price, day, month,place,lugguage));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ticketList;
    }

    public ArrayList<TrainTicket> getAllTrainTicket(){
        ArrayList<TrainTicket> ticketList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM ticket WHERE typeID = 1");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String whereFrom = resultSet.getString("whereFrom");
                String where = resultSet.getString("wheree");
                int price = resultSet.getInt("price");
                int day = resultSet.getInt("day");
                String month = resultSet.getString("month");
                int place = resultSet.getInt("place");
                String type = resultSet.getString("type");
                ticketList.add(new TrainTicket(id, name,whereFrom, where, price, day, month,place,type));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ticketList;
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
                //ticketList.add(new Ticket(id, whereFrom, where, price, day, month));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ticketList;
    }


    public ArrayList<PlaneTicket> findPlaneTicket(PlaneTicket planeTicket){
        ArrayList<PlaneTicket> planeTicketList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM ticket WHERE typeID = 2 AND whereFrom = '" + planeTicket.getWhereFrom() +
                    "' AND wheree = '" + planeTicket.getWhere() + "' AND month = '" + planeTicket.getMonth() + "' AND day = '" + planeTicket.getDay() +
                    "' AND luggage = '" + planeTicket.getLuggage() + "'");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String whereFrom = resultSet.getString("whereFrom");
                String where = resultSet.getString("wheree");
                int price = resultSet.getInt("price");
                int day = resultSet.getInt("day");
                String month = resultSet.getString("month");
                int place = resultSet.getInt("place");
                String luggage = resultSet.getString("luggage");
                planeTicketList.add(new PlaneTicket(id, name, whereFrom, where, price, day, month, place, luggage));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return planeTicketList;
    }

    public ArrayList<TrainTicket> findTrainTicket(TrainTicket trainTicket){
        ArrayList<TrainTicket> trainTicketList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM ticket WHERE typeID = 1 AND whereFrom = '" +
                    trainTicket.getWhereFrom() + "' AND wheree = '" + trainTicket.getWhere() + "' AND month = '" +
                    trainTicket.getMonth() + "' AND day = '" + trainTicket.getDay() + "' AND type = '" + trainTicket.getType() + "'");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String whereFrom = resultSet.getString("whereFrom");
                String where = resultSet.getString("wheree");
                int price = resultSet.getInt("price");
                int day = resultSet.getInt("day");
                String month = resultSet.getString("month");
                int place = resultSet.getInt("place");
                String type = resultSet.getString("type");
                trainTicketList.add(new TrainTicket(id, name, whereFrom, where, price, day, month, place, type));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return trainTicketList;
    }
}
