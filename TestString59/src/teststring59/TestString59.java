
package teststring59;

import java.util.Scanner;


public class TestString59 {

  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter ur email id ");
        String userEmail=s.next();
    
        String message=String.format("Wlcome %s to Google",userEmail);
        
        if(userEmail.equalsIgnoreCase("java")){
            System.out.println("Enter ur password");
            String password=s.next();
            
            if(password.equals("Java1234")){
                System.out.println(message);
            }
            else{
                System.out.println("Incorrect Password");
            }
            
        }
        else{
            System.out.println("Couldn't find ur Google Account");
        }
        
        
    }
    
}
