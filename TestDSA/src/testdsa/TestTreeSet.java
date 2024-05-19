
package testdsa;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class TestTreeSet {
   
    
    public static void main(String[] args) {
        
        TreeSet<String> namesL = new TreeSet<>();
         
         
        namesL.add("Hasan");
        namesL.add("Raju");
        namesL.add("Najmul");
        namesL.add("Towhid");
        namesL.add("Towhid");
        
        System.out.println(namesL);
        System.out.println(namesL.first());
        System.out.println(namesL.last());
        System.out.println(namesL.headSet("T"));
        System.out.println(namesL.tailSet("H"));
        System.out.println(namesL.lower("Raju"));
        System.out.println(namesL.higher("N"));
        
    }
    
}
