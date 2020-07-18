//Handling a Random Access File
import java.io.*;
class Demo12{
    public static void main(String[]args){
        RandomAccessFile file = null;
        try{
            file = new RandomAccessFile("raw.dat","rw");
            //writing to the file
            file.writeChar('X');
            file.writeInt(555);
            file.writeDouble(3.1412);

            file.seek(0);//Go to the begining
            //Reading from the file
            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());

            file.seek(2);//go to the seonf item
            System.out.println(file.readInt());
            //go to the end and append false to the file
            file.seek(file.length());
            file.writeBoolean(false);
            file.seek(4);
            System.out.println(file.readBoolean());
            file.close();

        }catch(IOException e){
            System.out.println(e);
        }
      
    }
}