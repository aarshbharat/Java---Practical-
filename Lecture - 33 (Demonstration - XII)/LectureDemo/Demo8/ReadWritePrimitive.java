import java.io.*;
class ReadWritePrimitive{
    public static void main(String[]args){
        File primitive = new File("prim.dat");
        FileOutputStream fos = new FileOutputStream(primitive);
        DataOutputStream dos = new DataOutputStream(fos);

        //Write primitive data to the "prim.dat"
        dos.writeInt(1999);
        dos.writeDouble(387.56);
        dos.writeBoolean(false);
        dos.writeChar('X');
        dos.close();
        fos.close();

        //Read Data From "prim.dat"
        FileInputStream fis = new FileInputStream(primitive);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        dis.close();
        fis.close();
    }
}