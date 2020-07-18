import java.io.*;
class WriteBytes{
    public static void main(String[]args){
        cities = {'D','E','L','H','I','\n','M','A','D','R','S','\n','A','D','I','P','U','R','\n'};
        //Declare and initialize a byte array byte
        FileOutputStream outfile = null; //create output file stream
        try{
            outfile = new FileOutputStream("City.txt");
            //Connect the outfile stream to "city.txt"
            outfile.write(cities); //Write data to the stream
            outfile.close();
        }
        catch(IOException ioe){
            System.out.println(ioe);
            System.exit(-1);
        }
    }
}