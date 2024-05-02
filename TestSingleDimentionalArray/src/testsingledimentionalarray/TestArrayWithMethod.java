package testsingledimentionalarray;

import java.util.Random;

public class TestArrayWithMethod {

    public static void main(String[] args) {
        int[] myList = new int[100];

        for (int i = 0; i < myList.length; i++) {
            Random r = new Random();
            int num = r.nextInt(100) + 1;
            myList[i] = num;

        }
        
    int maxNumber=    maxNumber(myList);
    int avg=avg(myList);
    
        minNumber(myList);
        System.out.println(maxNumber);
        System.out.println(avg);

    }

    public static int maxNumber(int[] myArray) {
        int max = myArray[0];     

        for (int val : myArray) {
            if (max < val) {      // 0<5
                max = val;      // max=5
            }

        }

        return max;
    }

    public static void minNumber(int[] myArray) {
        int min = myArray[0];
        for (int val : myArray) {

            if (min > val) {  //99 >5 
                min = val;
            }
        }

        System.out.println("Min numbner is "+ min);
    }

    public static int avg(int[] myArray) {

        int sum = 0;
        int avg = 0;

        for (int val : myArray) {
            sum += val;
        }

        avg = sum / myArray.length;

        return  avg;
    }

}
