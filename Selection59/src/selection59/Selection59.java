package selection59;

import java.util.Scanner;

public class Selection59 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int maxNumber;
//        
//        System.out.println("Enter First Number ");
//        int firstNumaber=scanner.nextInt();
//        
//        System.out.println("Enter Second Number ");
//        int secondNumaber=scanner.nextInt();
//        
//        System.out.println("Enter Third Number ");
//        int thirdNumaber=scanner.nextInt();
//        
//        if(firstNumaber> secondNumaber && firstNumaber> thirdNumaber){
//            maxNumber=firstNumaber;
//        }
//        else if(secondNumaber>firstNumaber && secondNumaber>thirdNumaber){
//            maxNumber=secondNumaber;
//        }
//        else{
//        
//            maxNumber=thirdNumaber;
//        }
//        
//        System.out.println("Maximum number is "+ maxNumber);
//        int randNumber =(int)(Math.random()*100);
//        
//        System.out.println(randNumber);
//

//        int marks = scanner.nextInt();
//        if (marks < 0) {
//            System.out.println("Invalid");
//
//        } else if (marks <= 32) {
//            System.out.println("F");
//        } else if (marks <= 100) {
//            System.out.println("A+");
//        } else {
//            System.out.println("Invalid");
//        }
//        System.out.println("Pls enter Day number ");
//        int numberOfDay=scanner.nextInt();
//        String dayName="";
//        
//        switch (numberOfDay) {
//            case 1:
//                dayName="Saturday";                
//                break;
//            case 2:
//                dayName="Sunday";                
//                break;
//            
//            case 3:
//                dayName="Monday";                
//                break;
//            
//            case 4:
//                dayName="Tuesday";                
//                break;
//            
//            case 5:
//                dayName="Wednesday";                
//                break;
//            
//            case 6:
//                dayName="Thursday";                
//                break;
//            
//            case 7:
//                dayName="Friday";                
//                break;           
//            
//            default:
//                dayName="Invalid Day Number";
//        }
//        
//        System.out.println("Your desier day name is "+dayName);
        System.out.println("Pls enter First Number");
        float number1 = scanner.nextFloat();
        System.out.println("Pls enter Second Number");
        float number2 = scanner.nextFloat();
        System.out.println("Add(+) press 1 \nSubstruction(-) press 2 \nMultiplication(X) press 3 \nDivididation(/) press 4");
        int choice=scanner.nextInt();
        
        float result=0.0f;
        
        switch (choice) {
            case 1:
                result=number1+number2;    
                break;        
                
            case 3:
                result=number1*number2;    
                break;
            case 4:
                result=number1/number2;    
                break;
                
            default:
                System.out.println("invalid Choice ");
        }
        
        System.out.println("Result is "+result);
        

    }

}
