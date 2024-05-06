package testobejectthinking59;

import java.util.Arrays;
import math.Factoril;

public class TestObejectThinking59 {

    public static void main(String[] args) {

//        Factoril f = new Factoril(50);
//
//        System.out.println(f.getFactorial());
        String name = "Hasan";
        name = "Raju Ahmed Babu";
        int a=10;

        String s = "Java";
        s = "HTML";

//        System.out.println(name.charAt(2));
//        System.out.println(name.substring(2, 5));
//        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.replace("r", "N"));
        System.out.println(Arrays.toString(name.split("a")));

        System.out.println("Java is fun".matches("Java.*"));
    
        char[] chars = "Java".toCharArray();
    
        System.out.println(Arrays.toString(chars));
        
        System.out.println(Integer.parseInt("23"));
        
        StringBuilder builder=new StringBuilder();
        
        builder.append("Hello Java");
        builder.append(" Good Bye");
        
        
        System.out.println(builder.reverse());
        
        System.out.println(String.valueOf(a)+"Hi");
    
    }

}
