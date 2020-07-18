import java.io.*;

public class InsufficientFundsException extends Exception{
    public double amount = 0;
    public InsufficientFundsException(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}