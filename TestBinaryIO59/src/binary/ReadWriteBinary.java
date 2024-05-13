package binary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBinary {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f=new File("C:\\Users\\user\\Desktop\\java59.dat");
        
        FileOutputStream fos = new FileOutputStream(f);
        
        for (int i = 1; i <= 100; i++) {
            
            fos.write(i);
        }
        
        fos.close();
        
        FileInputStream fis=new FileInputStream(f);
        
             
     
        int value;
        while((value=fis.read()) !=-1){
            
            System.out.println(value); 
        }
   
    }  
}
