package Database;
import Class.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Package implements Serializable {
    private String operationType;
    private Customer customer;


    public Package(String operationType) {
        this.operationType = operationType;
    }

    public Package(String operationType, ArrayList<Customer> customers) {
        this.operationType = operationType;
        this.customers = customers;
    }

    public Package(String operationType, Customer customer) {
        this.operationType = operationType;
        this.customer = customer;
    }

    private ArrayList<Customer> customers;

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

}
