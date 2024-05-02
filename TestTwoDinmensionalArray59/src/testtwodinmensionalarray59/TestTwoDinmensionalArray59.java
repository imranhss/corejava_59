package testtwodinmensionalarray59;

import java.util.Arrays;
import java.util.Random;

public class TestTwoDinmensionalArray59 {

    public static void main(String[] args) {

//        int[][] numers=new int[3][4];
//        
//        Random random=new Random();
//        
//        for(int row=0; row<numers.length; row++){
//            for(int column=0; column<numers[0].length; column++){
//                int randomNumber=random.nextInt(20);
//                numers[row][column]=randomNumber;
//            }        
//        }
        int[][] numers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int sum=doSumOfArrays(numers);
        
        System.out.println(sum);

    }

    public static int doSumOfArrays(int[][] myArrays) {
        int sum = 0;
        for (int row = 0; row < myArrays.length; row++) {
            for (int col = 0; col < myArrays[0].length; col++) {
                sum += myArrays[row][col];
            }
        }
        return sum;
    }

}
