
package vehiclemanagement59;

import vehicle.Truck;


public class VehicleManagement59 {

    
    public static void main(String[] args) {
       
        Truck truck=new Truck();
        truck.setRegularprice(200);
        truck.setWeight(2001);
        
        System.out.println(truck.getSalePrice());
        
    }
    
}
