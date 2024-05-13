package testbinaryio59;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestBinaryIO59 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\user\\Desktop\\java59.txt");

        PrintWriter write = new PrintWriter(file);
        write.print("Today is oourEvidencw Exam at 5.00 PM");
        write.append("\nToday is oourEvidencw Exam at 4.00 PM");
        write.close();

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {

            System.out.println(scanner.nextLine());
        }

    }

}
