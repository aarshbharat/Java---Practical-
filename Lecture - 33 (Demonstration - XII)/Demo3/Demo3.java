//Java FileOutputStream :  Write a byte into a file
import java.io.*;
class Demo3{
    public static void main(String[]args){
        byte cities[] = {'D','E','L','H','I',' ','M','A','D','R','S','\n','A','D','I','P','U','R','\n'};
        FileOutputStream outfile = null;//create an outputfile stream
        try{
            outfile = new FileOutputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo3/city.txt");
            //connect the outfile stream to city.txt
            outfile.write(cities);//write data to the stream
            outfile.close(); 
        }catch(IOException ioe){
            System.out.println(ioe);
            System.exit(-1);
        }
    }
}