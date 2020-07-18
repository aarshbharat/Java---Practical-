//Copying Characters From one file to another
import java.io.*;
class CopyCharacters{
    public static void main(String[]args){
        //Declare and Create input and output files
        File inFile = new File("input.dat");
        File outFile = new File("output.dat");
        FileReader ins = null; //Create file stream ins
        FileWriter outs = null;//Create file stream outs
        try{
            ins = new FileReader(inFile);//opens a inFile
            outs = new FileWriter(outFile); //open outFile
            int ch;
            while((ch = ins.read())!=(-1)){
                outs.write(ch);
            }
        }catch(IOException e){
            System.out.println(e);
            System.exit(-1);

        }finally{   // close file
            try{
                ins.close();
                outs.close();
            }catch(IOException e){ }
        }
    }
}