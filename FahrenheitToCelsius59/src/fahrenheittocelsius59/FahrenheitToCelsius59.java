
package fahrenheittocelsius59;

import java.util.Scanner;


public class FahrenheitToCelsius59 {

 
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        
        System.out.println("Pls enter temperature in Fahrenheit: ");
        
        float fertemp=input.nextFloat();
        
        float result=((fertemp-32)/9)*5;
        
        System.out.println("Temperature in Celsius: "+result);
        
        System.out.println(System.currentTimeMillis());
        
    } 
    
}
