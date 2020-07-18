//Example of BufferedOutputStream class for writing into a file
import java.io.*;
public class Demo8{
    public static void main(String[]args) throws Exception{
        FileOutputStream fout = new FileOutputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo8/testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to NPTEL Java course";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success");
    }
}