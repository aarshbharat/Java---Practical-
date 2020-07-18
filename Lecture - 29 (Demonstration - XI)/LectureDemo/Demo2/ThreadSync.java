//not successfully run
import java.lang.*;
class Account{
    public int balance;
    public int accountNo;
    void displayBalance(){
        System.out.println("Account No : "+accountNo+" Balance : "+balance);
    }
    synchronized void deposite(int amount){
        //Method to deposite amount
        balance = balance + amount;
        System.out.println(amount+" is Deposited");
        displayBalance();
    }
    synchronized void withdraw(int amount){
        //method to withdraw amount
        balance = balance - amount;
        System.out.println(amount+" is withdrawn");
        displayBalance();
    }
}
//To implement a thread for deposite
class TranscationDeposite implements Runnable{
    Account accountX;
    TranscationDeposite(Account x,int amount){
        //Constructor to initiate this thread
        accountX = x;
        //int amount;
        this.amount=amount;
        new Thread (this).start();
        System.out.println("Thread for Deposite is Initiated");
    } 
    public void run(){
        accountX.deposite(amount);
    }
} 
class TranscationWithdraw implements Runnable{
    Account accountY;
    int amount;
    TranscationWithdraw(Account y,int amount){
        accountY=y;
        this.amount = amount;
        new Thread (this).start();
    }
    public void run(){
        accountY.withdraw(amount);
    }
}
class Transcation{
    public static void main(String[]args){
        Account ABC = new Account(); //create an account
        ABC.balance = 1000; //initialize the account by Rs 1000
        TranscationDeposite t1; //A Thread for Deposite
        TranscationWithdraw t2; //A thread for withdrawn
        t1 = new TranscationDeposite(ABC,500);
        t2 = new TranscationWithdraw(ABC,900);
        //Two Threads are Started 
    }
}