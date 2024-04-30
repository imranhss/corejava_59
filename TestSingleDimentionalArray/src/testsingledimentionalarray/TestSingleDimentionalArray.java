package testsingledimentionalarray;

import java.util.Arrays;
import java.util.Random;

public class TestSingleDimentionalArray {

    public static void main(String[] args) {

        int[] myList = new int[100];

//        String[] names=new String[15];
//        boolean[] status=new boolean[15];
        for (int i = 0; i < myList.length; i++) {
            Random r = new Random();
            int num = r.nextInt(100) + 1;
            myList[i] = num;

        }
        int sum = 0;
        int avg = 0;
        int count = 0;
        int[] newList = new int[myList.length];

        for (int val : myList) {
            sum += val;
        }

        avg = sum / myList.length;

        int index = 0;
        for (int val : myList) {

            if (val > avg) {
                count += 1;
                newList[index] = val;
                index++;
            }
        }

        System.out.println(Arrays.toString(myList));
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(count);
        System.out.println(Arrays.toString(newList));

    }

}
