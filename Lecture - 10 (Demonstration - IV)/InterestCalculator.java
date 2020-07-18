//Input with DataInputStream : Calculator Program
import java.io.*;
public class InterestCalculator{
    public static void main(String[] args) throws Exception{
        Float principalAmount = new Float(0);
        Float rateofInterest = new Float(0);
        int numberOfYears = 0;
        try{
        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        System.out.println("Enter Principal Amount: ");
        System.out.flush(); // this method clean the buffer (here)
        tempString= in.readLine(); 
        principalAmount = Float.valueOf(tempString);
        System.out.println("Enter Rate of Interest : ");
        System.out.flush();
        tempString = in.readLine();
        rateofInterest = Float.valueOf(tempString);
        System.out.println("Enter Number of years");
        System.out.flush();
        tempString = in.readLine();
        numberOfYears = Integer.parseInt(tempString);
        
        //calculation of interest
        float interestTotal = principalAmount*rateofInterest*numberOfYears;
        System.out.println("Total Interest = "+interestTotal);
    }catch(Exception ex){
        //System.out.println("I/O Error");
    }
    }
}