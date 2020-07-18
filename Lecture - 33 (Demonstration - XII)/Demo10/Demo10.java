//Java SequanceInputStream Example : Reading sequance of file
import java.io.*;
class Demo10{
    public static void main(String[]args)throws Exception{
        FileInputStream input1 = new FileInputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo10/input1.txt");
        FileInputStream input2 = new FileInputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo10/input2.txt");
        SequenceInputStream inst = new SequenceInputStream(input1,input2);
        int j;
        while((j=inst.read())!=-1){
            System.out.print((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}