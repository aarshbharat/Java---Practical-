import java.io.*;
class Demo11{
    public static void main(String[]args) throws IOException{
        //Declare File Streams 
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        SequenceInputStream file3 = null; // Declare file3 to store combined files
        //open the file to concatenated
        file1 = new FileInputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo11/input1.txt");
        file2 = new FileInputStream("D:/Java/NPTEL/Programmes/Lecture - 33 (Demonstration - XII)/Demo11/input2.txt");
        file3 = new SequenceInputStream(file1,file2); //concatenate file1 and file2
        //create buffered input and output streams
        BufferedInputStream inBuffer = new BufferedInputStream(file3);
        BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);
        //Read and Write till the end of the buffer
        int ch;
        while((ch=inBuffer.read())!=-1){
            outBuffer.write((char)ch);
        }
        inBuffer.close();
        outBuffer.close();
        file1.close();
        file2.close(); 
    }
}