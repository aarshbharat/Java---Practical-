import java.util.*;//For using StringTokenizer class
import java.io.*;
class Inventory{
    static DataInputStream din = new DataInputStream(System.in);
    static StringTokenizer st;
    public static void main(String args[]) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("Invent.txt"));
        //Reading from console
        System.out.println("Enter Code Number");
        st = new StringTokenizer(din.readLine());
        int code = Integer.parseInt(st.nextToken());
        System.out.println("Enter Number of Items");
        st = new StringTokenizer(din.readLine());
        int items = Integer.parseInt(st.nextToken());
        System.out.println("Enter Cost");
        st = new StringTokenizer(din.readLine());
        double cost = new Double(st.nextToken()).doubleValue();
        //Writing to the file "invent.dat"
        dos.writeInt(code);
        dos.writeInt(items);
        dos.writeDouble(cost);
        dos.close();
        //Processing data from the file
        DataInputStream dis = new DataInputStream(new FileInputStream("Invent.txt"));
        int codeNumber = dis.readInt();
        int totalItems = dis.readInt();
        double itemCost = dis.readDouble();
        double totalCost = totalItems*itemCost;
        dis.close();
        //writing to console
        System.out.println();
        System.out.println("Code Number : "+codeNumber);
        System.out.println("Item Cost : "+itemCost);
        System.out.println("Total Items : "+totalItems);
        System.out.println("Total Cost : "+totalCost);
    }
}