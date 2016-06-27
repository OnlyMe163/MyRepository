package model;

/**
 * Created by Дмитрий on 27.06.2016.
 */
public class Purchase {
    int id;
    double value;
    int type;
    String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Purchase() {

    }

    public Purchase(double value, int type, String comment) {

        this.value = value;
        this.type = type;
        this.comment = comment;
    }

    public Purchase(int id, double value, int type, String comment) {

        this.id = id;
        this.value = value;
        this.type = type;
        this.comment = comment;
    }
}
