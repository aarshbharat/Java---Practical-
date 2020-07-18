//How to set thread priority 
import java.lang.*;
class ThreadA extends Thread{
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println("From Thread A with i = "+(-1)*i);
        }
        System.out.println("Exiting from thread A.....");
    }
}
class ThreadB extends Thread{
    public void run(){
        for(int j = 1;j<=5;j++){
            System.out.println("From Thread B with j = "+2*j);
        }
        System.out.println("Exiting from thread B.....");
    }
}
class ThreadC extends Thread{
    public void run(){
        for(int k = 1;k<=5;k++){
            System.out.println("From Thread C with k = "+(2*(k-1)));
        }
        System.out.println("Exiting from thread C.....");
    }
}
class ThreadDemo5{
    public static void main(String[]args){
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        ThreadC t3 = new ThreadC();

        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(t2.getPriority()+1);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start(); 
        t2.start(); 
        t3.start();
        System.out.println(".......End of execution");
    }
}
