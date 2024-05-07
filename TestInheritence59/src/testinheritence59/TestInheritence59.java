package testinheritence59;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import phone.Android;
import phone.IPhone;
import phone.Mobile;
import phone.Student;

public class TestInheritence59 {

    public static void main(String[] args) {

        Android android = new Android();
        IPhone phone = new IPhone("Yes", true, "makeTextMessage", "20 MPX", "camera");

        Mobile m = new Mobile();
//        android.setCamera("48 MPX Camera");
//        android.setMakeCall(true);
//        android.setMakeTextMessage("SMS/MMS");
//        android.setPlayStore("Yes Use Play Store");
//        android.setToucheAble(true);
//        android.setMultimedia("FM/PNG");
//        
//        android.printDetails();
        // phone.printDetails();    

        Student hasan = new Student("Hasan", "hsasn@hmail.com", "12345679");
        Student raju = new Student("raju", "raju@hmail.com", "12345679");
        Student sanaullah = new Student("sanaullah", "sanaullah@hmail.com", "12345679");
        Student nafis = new Student("nafis", "nafis@hmail.com", "12345679");
        Student nusrat = new Student("nusrat", "nusrat@hmail.com", "12345679");

        List<Student> stuentList = new ArrayList<>();
        
        stuentList.add(raju);
        stuentList.add(hasan);
        stuentList.add(sanaullah);
        stuentList.add(nafis);
        stuentList.add(nusrat);
        stuentList.add(new Student("AAA", "email", "sgfdjgd"));

        for (Student s : stuentList ) {
        
            System.out.println(s);
        }

    }

}
