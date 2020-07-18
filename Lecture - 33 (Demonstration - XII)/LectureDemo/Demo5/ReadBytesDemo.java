import java.io.*;
class RreadBytesDemo{
    public static void main(String []args){
        FileInputStream infile = null; //Create an input file stream
        int b;
        try{
            infile = new FileInputStream(args[0]);//connect infile stream to the required file
            while((b=infile.read())!=(-1)){
                System.out.print((char)b); // Read and Display data
            }
            infile.close();
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}