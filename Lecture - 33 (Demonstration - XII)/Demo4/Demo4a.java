//Java FileInputStream : Reading a single character from file 
import java.io.*;
public class Demo4a{
    public static void main(String[]args){
        try{
            FileInputStream fin = new FileInputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo4/testout.txt");
            int i = 0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();   
        }catch(Exception e){
            System.out.println(e);
        }
    }
}