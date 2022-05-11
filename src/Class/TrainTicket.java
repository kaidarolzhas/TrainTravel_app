package Class;

import java.io.Serializable;

public class TrainTicket extends Ticket implements Serializable {
    private String type;

    public TrainTicket(Integer id, String whereFrom, String where, int day, String month, String type) {
        super(id, whereFrom, where, day, month);
        this.type = type;
    }

    public TrainTicket(Integer id, String name, String whereFrom, String where, int price, int day, String month, int place, String type) {
        super(id, name, whereFrom, where, price, day, month, place);
        this.type = type;
    }


    @Override
    public String toString() {
        return "TrainTicket{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
