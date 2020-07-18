//Copying a file into another file using Character Stream class
import java.io.*;
public class Demo6 {
    public static void main(String[]args){
        //Declare and create input and output files
        File inFile = new File("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo6/input.dat");
        File outFile = new File("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo6/output.dat");
        FileReader ins = null; //create file stream ins 
        FileWriter outs = null; //creates file stream outs
        try{
            ins = new FileReader(inFile);//opens a file
            outs = new FileWriter(outFile); // opens outFile
            int ch;//read and write till the end
            while((ch=ins.read())!=-1){
                outs.write(ch);
            }
        }catch(IOException e){
            System.out.println(e);
            System.exit(-1);
        }finally{
            //close files
            try{
                ins.close();
                outs.close();
            }catch(IOException e){}
        }
    }
}