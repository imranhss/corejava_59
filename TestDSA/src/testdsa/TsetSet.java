package testdsa;

import java.awt.BorderLayout;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TsetSet {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Hasan");
        names.add("Raju");
        names.add("Najmul");
        names.add("Towhid");
        names.add("Towhid");
        
        //System.out.println(names.size());
        
        
         Set<String> namesL = new LinkedHashSet<>();
         
         
        namesL.add("Hasan");
        namesL.add("Raju");
        namesL.add("Najmul");
        namesL.add("Towhid");
        namesL.add("Towhid");
        
        for(Object o : namesL){
            System.out.println(o);
        
        }
        
        //System.out.println(namesL.size());
        

    }

}
