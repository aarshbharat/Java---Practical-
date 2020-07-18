import java.io.*;
class RandomAccess{
    public static void main(String[]args){
        RandomAccessFile rFile;
        try{
            rFile = new RandomAccessFile("City.txt","rw");
            rFile.seek(rFile.length());//Go to the end
            rFile.writeByte("MUMBAI\n");//Append MUMBAI
            rFile.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}