
package testloops59;

import java.util.Scanner;


public class TestBreakContinue {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        int sum=0;
        
        while(true){     
            System.out.println("Enter Value");
            int userInput=s.nextInt();
            sum +=userInput;
            
            if(sum>=200){
                                              
            } 
            else if(sum>=100){
                continue;
            }
            
            System.out.println("Sum is "+sum);
        }
        
        
    }    
    
}
