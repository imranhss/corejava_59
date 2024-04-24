package computearea59;

import java.util.Scanner;

public class ComputeArea59 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);        
//        System.out.println("Pls enter the value of Radius:");
//        double radius = input.nextDouble();
//        double area;
//        area = radius * radius * 3.1416;
//        System.out.println(area);
        
        System.out.println("Enter length ");
        double length=input.nextDouble();
        System.out.println("Enter Width ");
        double width=input.nextDouble();
        
        double area= length*width;
        
        System.out.println("Area of Rectangle is "+area);
        
        long number=10L;
        

    }

}
