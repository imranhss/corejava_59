
package testloops59;


public class Factorial {
    
    public static void main(String[] args) {
     
            long facValue=17;
            long factorial=1;
            
//            for(int i=1; i<=facValue; i++){
//                   factorial *=i; //  factorial=factorial*i 24
//            }
            
            for(long i=facValue; i>=1; i--){
                   factorial *=i; //  factorial=factorial*i
            }
            
            System.out.println("Factorial is "+factorial);
        
    }    
    
}
