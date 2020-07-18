import java.io.*;
class SequenceBuffer{
    public static void main(String[]args) throws IOException {
        //Declare File Streams
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        //Declare file3 to store to combined files 
        SequenceInputStream file3 = null;
        //open the files to be connected
        file1 = new FileInputStream("text1.dat");
        file2 = new FileInputStream("text2.dat");
        //Connect file1 and file2
        file3 = new SequenceInputStream(file1,file2);

        //Create a buffered input and output streams
        BufferedInputStream inBuffer = new BufferedInputStream(file3);
        BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);

        //read write till the end of buffer  
        int ch;
        while((ch==inBuffer.read()) != -1){
            outBuffer.write((char)ch);
            inBuffer.close();
            outBuffer.close();
            file1.close();
            file2.close();
        }
    }
}