package Class;

import java.io.Serializable;

public class Ticket implements Serializable {
    private Integer id;
    private String name;
    private String whereFrom;
    private String where;
    private int price;
    private int day;
    private String month;
    private int place;

    public Ticket() {
    }

    public Ticket(Integer id, String name, String whereFrom, String where, int price, int day, String month, int place) {
        this.id = id;
        this.name = name;
        this.whereFrom = whereFrom;
        this.where = where;
        this.price = price;
        this.day = day;
        this.month = month;
        this.place = place;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWhereFrom() {
        return whereFrom;
    }

    public void setWhereFrom(String whereFrom) {
        this.whereFrom = whereFrom;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }


    public String info() {
        return   id + " " +
                 name + ' ' +
                 whereFrom + ' ' +
                 where + ' ' +
                 price +  " " +
                 day + " " +
                 month + ' ' +
                 place + '\n';
    }
}
