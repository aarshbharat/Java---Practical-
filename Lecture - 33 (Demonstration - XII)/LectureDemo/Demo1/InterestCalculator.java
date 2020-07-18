import java.io.*;
class InterestCalculator{
    public static void main(String[]args){
        Float principalAmount = new Float(0);
        Float rateOfInterest = new Float(0);
        int numberOfYears = 0;
        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        System.out.print("Principal Amount : ");
        System.out.flush();
        tempString = in.readLine();
        principalAmount = Float.valueOf(tempString);
        System.out.print("Enter Rateof Interest : ");
        System.out.flush();
        tempString = in.readLine();
        rateOfInterest = Float.valueOf(tempString);
        System.out.print("Enter number of Years : ");
        System.out.flush();
        tempString = in.readLine();
        numberOfYears = Integer.parseInt(tempString);
        //Input is over : calculate the interest
        int interestTotal = (principalAmount)*(rateOfInterest)*((int)numberOfYears);
        System.out.println("Total Interest = "+interestTotal);   
    }
}