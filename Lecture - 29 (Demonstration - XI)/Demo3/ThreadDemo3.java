//Demonstration of thread class method : getID()
//java code for thread creation using thread class
import java.lang.*;
class ThreadId extends Thread{
    public void run(){
        try{
            //Display that thread is running 
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }catch(Exception e){
            //Throwing an Exception
            System.out.println("Exception is caught");
        }
    }
}
public class ThreadDemo3{
    public static void main(String[]args){
        int n = 8; //number of threads
        for (int i = 0; i < 8;i++){
            ThreadId object = new ThreadId();
            object.start();
        }
    }
}