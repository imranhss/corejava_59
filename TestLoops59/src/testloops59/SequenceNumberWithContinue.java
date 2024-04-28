
package testloops59;

import java.util.Scanner;


public class SequenceNumberWithContinue {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Start point value");
        int startPoint=s.nextInt();
        System.out.println("Enter End Poitnt value");
        int endPoint=s.nextInt();
        
        
        while(startPoint<=endPoint){
            
            if(startPoint %3==0 && startPoint%5==0){
                startPoint++;
                continue;
            }
            System.out.println("Number is "+startPoint);
            startPoint++;
        }
        
    }
    
}
