package geomatry;

import java.util.Date;

public abstract class GeoMatryObject {

    private String color = "White";
    private boolean filled;
    private Date dateCreated;

    public GeoMatryObject() {
        this.dateCreated = new Date();
    }

    public GeoMatryObject(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "GeoMatryObject{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
