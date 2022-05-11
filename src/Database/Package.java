package Database;
import Class.*;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.Serializable;
import java.util.ArrayList;

public class Package implements Serializable {
    private String operationType;
    private Customer customer;
    private TrainTicket trainTicket;

    private ArrayList<TrainTicket> trainTickets;
    private ArrayList<Customer> customers;



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
}
