package Filehandling;

import java.io.FileReader;
import java.io.FileWriter;

public class fileHandling {
public static void main (String []args) {
    String data = "this file shows the working of reading and writing a file";
    try {
      FileWriter output = new FileWriter("input.txt");
      output.write(data);
      System.out.println("Data is written to the file.");
      output.close();
      
      System.out.println("\n");
      char[] array = new char[100];
     
      FileReader output1 = new FileReader("input.txt");
      output1.read(array);
      System.out.println("Data in the file:");
      System.out.println(array);
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
 }
}
