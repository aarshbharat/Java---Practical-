//must check it some error occurs
import java.lang.*;
public class ThreadJoin{
    static void main(String[]args){
        Thread t1 = new Thread(new R(1));
        Thread t2 = new Thread(new R(2));
        t1.start();
        t2.start();
        try{
            t1.join(); // waits until t1 has terminated
            t2.join(); // waits until t2 has terminated
        }catch(InterruptedException e){}
        System.out.println("done");
    }
}