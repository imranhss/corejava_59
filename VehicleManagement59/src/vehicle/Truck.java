package vehicle;

public class Truck extends Vehicle {

    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularprice, String color) {
        super(speed, regularprice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    

    @Override
    public double getSalePrice() {

        if (this.weight > 2000) {

            return super.getRegularprice() - super.getRegularprice() * .10;
        } 
            
        return super.getRegularprice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

        
    }

}
