//java file output stream : write a byte into file
import java.io.*;
public class Demo2{
    public static void main(String[]args){
        try{
            FileOutputStream fout = new FileOutputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo2/test.text");
            fout.write(65);
            fout.write(90);
            fout.close();
            System.out.println("File Writing is over.....");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}