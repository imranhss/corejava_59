
package testfile59;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;


public class TestFile59 {

  
    public static void main(String[] args) throws FileNotFoundException {
        
        File file=new File("C:\\Users\\user\\Desktop\\java59.dat");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isAbsolute());
        System.out.println(new Date(file.lastModified()));
        
        PrintWriter output=new PrintWriter("C:\\Users\\user\\Desktop\\java59.dat");
        
        output.append("Hello ");
        output.append("Spring Boot");
        output.append(" Python");
        
        output.close();
        
        Scanner s=new Scanner(file);
        
        System.out.println(s.nextLine());
        
       
        
    }
    
}
