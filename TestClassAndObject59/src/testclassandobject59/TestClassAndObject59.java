package testclassandobject59;

import geomatry.Circle;
import math.MaxMin;
import math.MaxMinChange;
import math.PrimeNumber;

public class TestClassAndObject59 {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        PrimeNumber pn = new PrimeNumber(9);
        MaxMin maxMin=new MaxMin();
        
//        MaxMinChange.number1=10;
//        MaxMinChange.findMaxNumber();
//        
        

        
        maxMin.number1=20;
        maxMin.number2=30;
        maxMin.number3=10;
        
        
        MaxMin m=new MaxMin(50, 90, 20);

           
//        System.out.println(maxMin.number1);
        
        
        System.out.println(maxMin.findMaxNumber());
        System.out.println(maxMin.findMinNumber());
        
        System.out.println(m.findMaxNumber());
        System.out.println(m.findMinNumber());
        

        // String message = pn.checkPrimeNumber();
        
        
//        boolean message=pn.checkPrimeNumber();

//        if(message){
//            System.out.println("Its prime number");
//        }
//        else{
//                    System.out.println("Its prime number");
//
//        }
//        System.out.println(message);
//
//        //circle.setRadious(3);
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());

    }

}
