package testinheritence59;

import phone.Android;
import phone.IPhone;

public class TestInheritence59 {

    public static void main(String[] args) {

        Android android = new Android();
        IPhone phone = new IPhone("Yes", true, "makeTextMessage", "20 MPX", "camera");

//        android.setCamera("48 MPX Camera");
//        android.setMakeCall(true);
//        android.setMakeTextMessage("SMS/MMS");
//        android.setPlayStore("Yes Use Play Store");
//        android.setToucheAble(true);
//        android.setMultimedia("FM/PNG");
//        
//        android.printDetails();
        phone.printDetails();

    }

}
