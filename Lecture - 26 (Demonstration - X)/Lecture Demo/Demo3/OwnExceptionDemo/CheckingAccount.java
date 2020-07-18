import java.io.*;
//import OwnExceptionDemo.*;
public class CheckingAccount{
    private double balance = 0;
    private int number = 0;
    public CheckingAccount(int number){
        this.number = number;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount <= balance){
            balance = balance - amount;
        }
        else{
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
     public double getBalance(){
            return balance;
        }
    public int getNumber(){
            return number;
    }
}