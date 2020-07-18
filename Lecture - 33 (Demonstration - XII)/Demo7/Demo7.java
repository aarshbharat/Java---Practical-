//Copying   a file into another file using ByteStream Class
import java.io.*;
class Demo7{
    public static void main(String[]args){
        //Declare input and output file streams
        FileInputStream infile = null; //input stream
        FileOutputStream outfile = null; //output stream 
        byte byteRead; //declare a variable to hold a byte 
        try{
            //connect infile to in.dat
            infile = new FileInputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo7/input.dat");
            //connect outfile to out.dat
            outfile = new FileOutputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo7/output.dat");

            //Reading bytes fromin.dat andwriting to out.dat
            byteRead = (byte)infile.read();
            while(byteRead != -1){
                outfile.write(byteRead);    
                byteRead = (byte)infile.read();
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
             System.out.println(e);
             System.exit(-1);
        }
    }
}