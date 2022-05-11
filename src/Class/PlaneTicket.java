package Class;

import java.io.Serializable;

public class PlaneTicket extends Ticket implements Serializable {
    private String luggage;

    public PlaneTicket() {
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
}
