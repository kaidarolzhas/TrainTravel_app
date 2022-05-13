package Class;

import java.io.Serializable;

public class PlaneTicket extends Ticket implements Serializable {
    private String luggage;

    public PlaneTicket() {
    }

    public PlaneTicket(Integer id, String whereFrom, String where, int day, String month, String luggage) {
        super(id, whereFrom, where, day, month);
        this.luggage = luggage;
    }

    public PlaneTicket(Integer id, String name, String whereFrom, String where, int price, int day, String month, int place, String luggage) {
        super(id, name, whereFrom, where, price, day, month, place);
        this.luggage = luggage;
    }

    public String getLuggage() {
        return luggage;
    }

    public void setLuggage(String luggage) {
        this.luggage = luggage;
    }

    @Override
    public String toString() {
        return getId() + ") " + getWhereFrom() + "-->" + getWhere() + ", Day:" + getDay() + ", Month:" + getMonth() + ", Price:" + getPrice() + '\n'+ ", Place:" + getPlace() + ", Luggage:" + luggage;
    }
}
