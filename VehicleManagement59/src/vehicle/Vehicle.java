
package vehicle;

public class Vehicle {
    
    private int speed;
    private double regularprice;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int speed, double regularprice, String color) {
        this.speed = speed;
        this.regularprice = regularprice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularprice() {
        return regularprice;
    }

    public void setRegularprice(double regularprice) {
        this.regularprice = regularprice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
        
    public double getSalePrice(){
    
        return regularprice;
    }
}
