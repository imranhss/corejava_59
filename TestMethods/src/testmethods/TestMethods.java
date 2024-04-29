
package testmethods;

public class TestMethods {

 
    public static void main(String[] args) {
        
        
        System.out.println(doSum(10.0,20.0));
        System.out.println(doSum(50,60));
        System.out.println(doSum(50,100));
        System.out.println(doSum(10.0,30.0));
        
    }
    
   public static int doSum(double num1, double num2) {

        int result = (int) (num1 + num2);

        return result;
    }
    
    
}
