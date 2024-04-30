package randompasswordgenarator;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenarator {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        
        Random random = new Random();      
        System.out.println("Enter password length");
        int passLength=s.nextInt();
        
        String pass = "";
        String finalPassword="";

        //System.out.println(range);
        for (int i = 1; i <= passLength; i++) {
            
             int range = random.nextInt(3) + 1;
            switch (range) {
                case 1:
                    pass += (char) (random.nextInt(26) + 65);

                    break;
                case 2:
                    pass += (char) (random.nextInt(26) + 97);

                    break;
                case 3:
                    pass += (char) (random.nextInt(10) + 48);

                    break;

            }

        }

        for(int i=0; i<pass.length(); i++){
            
            if (i==pass.length()/2){
                finalPassword +="_"+pass.charAt(i);
            }else{
                finalPassword +=pass.charAt(i);
            
            }
                
        }
        
        
        System.out.println(finalPassword);

    }

}
