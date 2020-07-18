import java.io.*;
class InputStreamTest{
    public static void main(String[]args){
        int size;
        //To open a File input stream
        FileInputStream fin;
        fin = new FileInputStream(" C:\WINDOWS\SYSTEM\SYSTEM.INI");
        size = fin.available();
        //return the number of bytes available
        System.out.println("Total bytes :"+size);
        System.out.println("First 1/4 is displayed : using read()");
        for(int i = 0;i<size/4;i++){
            System.out.println((char)fin.read());
        }
        System.out.println("Remaining bytes : "+fin.available());
        System.out.println("Next 1/4 is displayed : using read(b[])");
        byte b[]=new byte[size/4];
        if(fin.read(b) != b.length){
            System.err.println("File reading error : ");
        }
        else{
            String temp = new String(b,0,0,b.length);
            //Convert the bytes into string
            System.out.println(temp);
            //display text string
            System.out.println("Still Available : "+fin.available());
            System.out.println("skipping 1/4 : Using Skip() ");
            fin.skip(size/4);
            System.out.println("File Reamining for read: "+fin.available());
        }
        fin.close(); //choose the input stream 
    }
}