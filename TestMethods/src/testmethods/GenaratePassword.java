
package testmethods;

import java.util.Random;


public class GenaratePassword {
    
    public static void main(String[] args) {
     
        Random rand = new Random();

        // Generate a random number between 1 and 3 (inclusive)
        int randomNumber = rand.nextInt(3) + 1;

        // Print the random number
        System.out.println("Random number: " + randomNumber);
        
    }
    
    
}
