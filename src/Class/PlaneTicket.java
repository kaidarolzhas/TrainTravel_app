package Class;

import java.io.Serializable;

public class PlaneTicket extends Ticket implements Serializable {
    private Boolean luggage;

    public PlaneTicket() {
    }

    public PlaneTicket(Integer id, String name, String whereFrom, String where, int price, int day, String month, int place, Boolean luggage) {
        super(id, name, whereFrom, where, price, day, month, place);
        this.luggage = luggage;
    }

    public Boolean getLuggage() {
        return luggage;
    }

    public void setLuggage(Boolean luggage) {
        this.luggage = luggage;
    }
}
