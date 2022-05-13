package Database;
import Class.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Package implements Serializable {
    private String operationType;
    private Customer customer;
    private TrainTicket trainTicket;
    private PlaneTicket planeTicket;
    private int id;
    private String login;

    private ArrayList<PlaneTicket> planeTickets;
    private ArrayList<TrainTicket> trainTickets;
    private ArrayList<Customer> customers;

    public Package() {
    }

    public Package(Customer customer) {
        this.customer = customer;
    }

    public Package(String operationType, String login) {
        this.operationType = operationType;
        this.login = login;
    }

    public Package(String operationType, int id) {
        this.operationType = operationType;
        this.id = id;
    }

    public Package(String operationType, PlaneTicket planeTicket) {
        this.operationType = operationType;
        this.planeTicket = planeTicket;
    }

    public Package(String operationType) {
        this.operationType = operationType;
    }



    public Package(String operationType, TrainTicket trainTicket) {
        this.operationType = operationType;
        this.trainTicket = trainTicket;
    }

    public Package(String operationType, ArrayList<Customer> customers) {
        this.operationType = operationType;
        this.customers = customers;
    }

    public Package(String operationType, Customer customer) {
        this.operationType = operationType;
        this.customer = customer;
    }


    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public TrainTicket getTrainTicket() {
        return trainTicket;
    }

    public void setTrainTicket(TrainTicket trainTicket) {
        this.trainTicket = trainTicket;
    }

    public ArrayList<TrainTicket> getTrainTickets() {
        return trainTickets;
    }

    public void setTrainTickets(ArrayList<TrainTicket> trainTickets) {
        this.trainTickets = trainTickets;
    }

    public ArrayList<PlaneTicket> getPlaneTickets() {
        return planeTickets;
    }

    public void setPlaneTickets(ArrayList<PlaneTicket> planeTickets) {
        this.planeTickets = planeTickets;
    }

    public PlaneTicket getPlaneTicket() {
        return planeTicket;
    }

    public void setPlaneTicket(PlaneTicket planeTicket) {
        this.planeTicket = planeTicket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
