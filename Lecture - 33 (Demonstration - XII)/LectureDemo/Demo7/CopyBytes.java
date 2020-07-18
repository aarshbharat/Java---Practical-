import java.io.*;
class CopyBytes{
    public static void main(String[]args){
        //Declare input and output file streams
        FileInputStream infile = null;
        //Input stream 
        FileOutputStream  outfile = null;
        //output stream 
        //Declare a variable to hold a byte
        byte byteRead;
        try{
            //connect infile to in.dat
            infile = new FileInputStream("in.dat");
            //connect outfile to out.dat
            outfile = new FileOutputStream("out.dat");
            //Reading bytes from in.dat and writing to out.dat
            do{
                byteRead =(byte) infile.read();
                outfile.write(byteRead);
            }while(byteRead != -1);
        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }catch(IOException e){
            System.out.println("e.getMessage()");
        }finally{
            try{
                infile.close();
                outfile.close();
            }catch(IOException e){}
        }
    }
}