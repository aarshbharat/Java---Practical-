//java FileOutputStream :  write a string into a file
import java.io.*;
public class Demo4{
    public static void main(String[]args){
        try{
            FileOutputStream fout = new FileOutputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo4/testout.txt");
            String s = "Welcome To gandhidham";
            byte b[] = s.getBytes();
            //converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("File Writing is over....");
        }catch(Exception e){
            System.out.println(e);
        }
    }
} 