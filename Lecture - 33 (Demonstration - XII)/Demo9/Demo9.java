//Example of Java BufferedInputStream for reading from a file
import java.io.*;
public class Demo9{
    public static void main(String[]args){
        try{
            FileInputStream fin = new FileInputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo9/out.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}