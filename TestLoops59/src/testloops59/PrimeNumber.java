package testloops59;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Start point value");
        int startPoint=s.nextInt();
        System.out.println("Enter End Poitnt value");
        int endPoint=s.nextInt();
        
        
        int count = 0;

        for (int j = startPoint; j <= endPoint; j++) {
            for (int i = 1; i <= j; i++) {

                if (j % i == 0) {
                    count++;// count=1 count=2
                }
            }

            if (count == 2) {
                System.out.println(j);
            } 
                
            count=0;
        }

    }

}
