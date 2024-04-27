
package testloops59;

import java.util.Scanner;


public class GuessNumber {
    
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        int randomNumber= (int) (Math.random()*101);
        
        int maxAttempts=3;
        int attemptsCount=0;
        
        while(attemptsCount<maxAttempts){
            
            System.out.println("Pls enter ur Guess Number");
            int guessNumber=s.nextInt();
           
            if(guessNumber== randomNumber){
                System.out.println("Congratulation !");
                break;
            }
            else if(guessNumber<randomNumber){
                System.out.println("Your gues number is lower");
            }
            else if(guessNumber>randomNumber){
             System.out.println("Your gues number is Higher");            
            }
          
            attemptsCount++;
        }
        
        if(attemptsCount==maxAttempts){
            System.out.println("Sorry You loss the game and the guess number is "+randomNumber);
            
        }
        
        
        
        
    }
    
}
