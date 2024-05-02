
package testsingledimentionalarray;

import java.util.Arrays;
import java.util.Random;


public class RangeOfPrimeNumber {
    
    public static void main(String[] args) {
       
        int[] numberArray=new int[100];
        
        for(int i=0; i<numberArray.length; i++){
            
            numberArray[i]=i+1;
                    
        }
        
       int[] result=rangeOfPrimeNumber(numberArray);
        
        System.out.println(Arrays.toString(result));
        
        
    }
    // myArray={1,2,3,4,5,6,7,8,9,10}
    
    public  static int[] rangeOfPrimeNumber(int[] myArray){
    
        int[] newArray=new int[50];
        int index=0;
        
        for(int item: myArray){ // item=1, item=20
            int count=0;
            for(int i=1; i<=item; i++){
                if(item%i==0){
                    count++;
                }
            
            }
            // end of For
            if(count==2){
                newArray[index]=item;
                index++;                
            }
            
        }
    
    return newArray;
    }
    
    
}
