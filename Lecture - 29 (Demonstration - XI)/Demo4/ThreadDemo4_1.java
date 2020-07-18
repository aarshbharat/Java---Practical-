//Use of Suspend() and resume() method
class ThreadA extends Thread{
    public void run(){
        try{
            System.out.println("First Thread Start Runing");
            sleep(10000);
            System.out.println("First Thread finishes running");
        }catch(Exception e){     }
    }
}
class ThreadB extends Thread{
    public void run(){
        try{
            System.out.println("Second Thread starts running");
            System.out.println("Second thread is suspended it self");
            suspend();
            System.out.println("Second Thread runs Again");
        }catch(Exception e){ }
    }
}
public class ThreadDemo4_1{
    public static void main(String [] args){
        try{
            ThreadA t1 = new ThreadA(); //it is newborn thread i.e. in newborn state 
            ThreadB t2 = new ThreadB(); // another new born thread 
            t1.start();//First is Sheduled for running 
            t2.start();//second is scheduled for running  
            System.out.println("recieve the second thread "); // If it is suspended
            t2.resume();

            System.out.println("Second Thread went for 10 secondes sleep");
            t2.sleep(10000);

            System.out.println("Wake up second thread and Finishes running");
            System.out.println("Demonstration is finished");
        }catch(Exception e){}
    }
}