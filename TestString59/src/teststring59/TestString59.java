package teststring59;

import java.util.Scanner;

public class TestString59 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            // Start Google Login 
//        System.out.println("Enter ur email id ");
//        String userEmail=s.next();
//    
//        String message=String.format("Wlcome %s to Google",userEmail);
//        
//        if(userEmail.equalsIgnoreCase("java")){
//            System.out.println("Enter ur password");
//            String password=s.next();
//            
//            if(password.equals("Java1234")){
//                System.out.println(message);
//            }
//            else{
//                System.out.println("Incorrect Password");
//            }
//            
//        }
//        else{
//            System.out.println("Couldn't find ur Google Account");
//        }


        //Start Facebook login 
//        System.out.println("Pls enter ur username ");
//        String userName = s.next();
//        System.out.println("Pls Enter ur Password");
//        String password = s.next();
//        String message=String.format("Wlcome %s to Google",userName);
//        
//        if(userName.equalsIgnoreCase("java") && password.equals("Java1234")){
//            System.out.println(message);
//        }
//        else{
//            System.out.println("Username or Password is incorrect");
//        }
        
        // Start urname with welcome 
        
        System.out.println("Enter Ur name ");
        String urName=s.nextLine();
        
        System.out.println("Welcome "+urName);
        System.out.println(String.format("Welcome %s",urName));

    }

}
