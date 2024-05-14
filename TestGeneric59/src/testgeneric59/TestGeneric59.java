/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testgeneric59;

import generic.GenericStack;
import generic.Pair;
import java.util.ArrayList;
import student.Student;

    
public class TestGeneric59 {

   
    public static void main(String[] args) {
         
        ArrayList<String> stringList=new ArrayList<>();
        
        ArrayList<Integer> intList=new ArrayList<>();
        
        ArrayList<Student> stuList=new ArrayList<>();
        
//        stringList.add("sadfdsfg");
//        stringList.add("s5645646");
//        
//        intList.add(55);
//        intList.add(572);
//        intList.add(782);
//        intList.add(22);
//       
//        
//        
//        stuList.add(new Student(1, "Najmul", "najmul@gmail.com"));
//        stuList.add(new Student(2, "Raju", "Raju@gmail.com"));
//        
//        
//        System.out.println(stuList);
//        System.out.println(intList);
        
        
        
        GenericStack<Student> sList=new GenericStack<>();
        
        sList.addData(new Student(2, "Raju", "Raju@gmail.com"));
        sList.addData(new Student(2, "Raju", "Raju@gmail.com"));
        
        sList.getSize();
        
//        System.out.println(sList.getSize());


        Pair<Integer, String> pair=new Pair<Integer, String>(10, "Ten");
        
        Pair<String, String> pair1=new Pair<String, String>("Value", "Ten");
        
       // Pair<String, Integer> pair1=new Pair<String, Integer>("Value", "Ten");
        
        
        System.out.println(pair.toString());
        System.out.println(pair1);
        
        
       
        

        
    }
    
}
