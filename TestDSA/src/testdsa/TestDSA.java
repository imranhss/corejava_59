package testdsa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author user
 */
public class TestDSA {

    public static void main(String[] args) {
        ArrayList<String> asianCountries = new ArrayList<>();
        asianCountries.add("Bangladesh");
        asianCountries.add("India");
        asianCountries.add("Nepal");
        asianCountries.add("Bhutan");
        asianCountries.add("Srilanka");

        //start Linked List
        System.out.println(asianCountries);
        LinkedList<Object> linkList = new LinkedList<>(asianCountries);

        linkList.add(2, "Japan");
        linkList.add("South Korea");
        linkList.addAll(linkList);

        System.out.println(linkList);

        ListIterator<Object> listIterator = linkList.listIterator();
        
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + " ");
        }

        // End Linked List
        ArrayList<String> euCountries = new ArrayList<>();

        euCountries.add("Portugal");
        euCountries.add("Enland");
        euCountries.add("Malta");
        euCountries.add("Spain");
        euCountries.add("Crosia");

        Iterator<String> it = euCountries.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        ArrayList<String> c1=(ArrayList<String>)(euCountries.clone());
//        
//        System.out.println(c1);
    }

}
