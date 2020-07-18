import java.io.*;
class ReadWriteIntegers{
    public static void main(String[]args){
        DataInputStream dis = null; // Input stream
        DataOutputStream dos = null; //output stream
        File intFile = new File("rand.dat");//Construct a file
        //Writing integers into file
        try{
            //create output stream for inFile file
            dos = new DataOutputStream(new FileOutputStream(intFile));
            for(int i=0;i<20;i++){
                dos.writeInt((int)(Math.random()*100));
            }
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }finally{
            try{
                dos.close();
            }catch(IOException ioe){}
        }
        //Reading integers from rand.dat
        try{
            dis = new DataInputStream(new FileInputStream(intFile));//create inputstream for intfile
            for(int i = 0; i<20; i++){
                int n = dis.readInt();
                System.out.println(n+" ");
            }
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }finally{
            try{
                dis.close();
            }catch(IOException ioe){
            }
        }
    }
}