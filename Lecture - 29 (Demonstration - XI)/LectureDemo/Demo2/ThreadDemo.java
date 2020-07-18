import java.lang.*;
import java.util.*;

public class ThreadDemo extends Thread{
    public void run(){
        for(int i = 0;i<3;i++){
            try{
                System.out.println(i);
                sleep((int)(Math.random()*5000)); //5 sec
                System.out.println(i);
            }catch(InterruptedException e){
                System.out.println(i);
            }
        }
    }
    public static void main(String[]args){
        new ThreadDemo().start();
        new ThreadDemo().start();
        System.out.println("Done");
    }
}