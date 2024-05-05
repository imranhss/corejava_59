package testclassandobject59;

import geomatry.Circle;
import math.PrimeNumber;

public class TestClassAndObject59 {
    
    public static void main(String[] args) {
        
        Circle circle = new Circle(5);
        PrimeNumber pn=new PrimeNumber(9);
        
        boolean message=pn.checkPrimeNumber();
        
        
        if(message){
            System.out.println("Its prime number");
        }
        else{
                    System.out.println("Its not prime number");

        }
        
        System.out.println(message);
        
        //circle.setRadious(3);
        
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        
    }
    
}
