
package testtwodinmensionalarray59;

import java.util.Arrays;
import java.util.Random;


public class TestTwoDinmensionalArray59 {

    public static void main(String[] args) {
        
        int[][] numers=new int[3][4];
        
        Random random=new Random();
        
        for(int row=0; row<numers.length; row++){
            for(int column=0; column<numers[1].length; column++){
                int randomNumber=random.nextInt(20);
                numers[row][column]=randomNumber;
            }        
        }
        
        
        
        System.out.println(Arrays.deepToString(numers));
        
    }
    
}
