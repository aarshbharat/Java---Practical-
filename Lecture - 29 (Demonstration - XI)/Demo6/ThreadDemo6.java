//Data Race Example 
public class ThreadDemo6 extends Thread{
    public static int x;
    public void run(){
        for(int i = 0;i<100;i++){
            x = x + 1;
            x = x - 1;
        }
    }
    public static void main(String[]args){
        x=0;
        for(int i = 0;i<1000;i++){
            new ThreadDemo6().start();
            System.out.println(x); // x is not always 0!
        }
    }
} 