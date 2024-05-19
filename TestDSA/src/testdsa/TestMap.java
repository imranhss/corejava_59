
package testdsa;

import java.util.HashMap;
import java.util.Map;


public class TestMap {
    
    public static void main(String[] args) {
        
        Map<String, Student> li=new HashMap<>();
        
        li.put("Hasan", new Student("Hasan", 23));
        li.put("Raju", new Student("Raju", 25));
//        li.put("Towhid", 25);
//        li.put("Hasan", 20);
        
        System.out.println(li);
        
    }
}
