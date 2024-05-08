package exhandaling59;

import java.util.Scanner;
import util.QuotientWithException;

public class ExHandaling59 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number");
        int number1 = scanner.nextInt();

        System.out.println("Enter Second Number");
        int number2 = scanner.nextInt();

        
        QuotientWithException exception=new QuotientWithException();
        
        System.out.println( exception.quotient(number1, number2));
        
        
//        try {
//            System.out.println(number1 / number2);
//        } catch (Exception e) {
//            e.printStackTrace();
//            //System.out.println(e);
//        }

//        if(number2 !=0){
//        System.out.println(number1/number2);
//        }
//        else{
//        
//            System.out.println("Second number can't be Zero(0)");
//            System.exit(1);
//        }
    }

}
