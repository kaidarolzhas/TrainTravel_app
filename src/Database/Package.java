package Database;
import Class.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Package implements Serializable {
    private String operationType;
    private Customer customer;
    private TrainTicket trainTicket;
    private PlaneTicket planeTicket;
    private Integer customer_id;
    private Integer ticket_id;
    private int id;
    private String login;
    private String whereFrom;
    private String wheree;
    private int day;
    private String month;
    private int place;
    private Ticket ticket;

    private ArrayList<Ticket> tickets;
    private ArrayList<PlaneTicket> planeTickets;
    private ArrayList<TrainTicket> trainTickets;
    private ArrayList<Customer> customers;
    public Package() {
    }


    public Package(Ticket ticket) {
        this.ticket = ticket;
    }

    public Package(int id, String login, String whereFrom, String wheree, int day, String month, int place) {
        this.id = id;
        this.login = login;
        this.whereFrom = whereFrom;
        this.wheree = wheree;
        this.day = day;
        this.month = month;
        this.place = place;
    }

    public Package(String operationType, int id, String login, String whereFrom, String wheree, int day, String month, int place) {
        this.operationType = operationType;
        this.id = id;
        this.login = login;
        this.whereFrom = whereFrom;
        this.wheree = wheree;
        this.day = day;
        this.month = month;
        this.place = place;
    }

    public Package(Customer customer) {
        this.customer = customer;
    }

    public Package(String operationType, String login) {
        this.operationType = operationType;
        this.login = login;
    }

    public Package(String operationType, Integer customer_id, Integer ticket_id) {
        this.operationType = operationType;
        this.customer_id = customer_id;
        this.ticket_id = ticket_id;
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

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getWhereFrom() {
        return whereFrom;
    }

    public void setWhereFrom(String whereFrom) {
        this.whereFrom = whereFrom;
    }

    public String getWheree() {
        return wheree;
    }

    public void setWheree(String wheree) {
        this.wheree = wheree;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
}
