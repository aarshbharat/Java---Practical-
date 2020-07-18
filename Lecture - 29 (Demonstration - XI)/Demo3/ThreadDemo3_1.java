//Demostration of thread class method : getId()
//java code for thread creation by implementing the Runnable Interface
class ThreadId implements Runnable{
    public void run(){
        try{
            //Displaying the thread that is running 
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }catch(Exception e){
            //Throwing an exception 
            System.out.println("Exception is caught");
        }
    }
}
//main class 
class ThreadDemo3_1{
    public static void main(String[]args){
        int n = 8; //Number of Threads
        for(int i = 0;i<8;i++){
            Thread object = new Thread(new ThreadId());
            object.start();
        }
    }
}