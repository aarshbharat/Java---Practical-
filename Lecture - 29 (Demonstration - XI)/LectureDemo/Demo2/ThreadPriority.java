class A extends Thread{
    public void run(){
        System.out.println("Thread A started.....");
        for(int i = 1;i<=4;i++){
            System.out.println("\t From Thread A : i = "+i);
        }
        System.out.println("Exit From A.....");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("Thread B started.....");
        for(int j = 1;j<=4;j++){
            System.out.println("\t From Thread B : j = "+j);
        }
        System.out.println("Exit From B.....");
    }
}
class C extends Thread{
    public void run(){
        System.out.println("Thread C started.....");
        for(int k = 1;k<=4;k++){
            System.out.println("\t From Thread C : k = "+k);
        }
        System.out.println("Exit From C.....");
    }
}
class ThreadPriority{
    public static void main(String [] args){
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority()+1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Started Thread A");
        threadA.start();
        System.out.println("Started Thread B");
        threadB.start();
        System.out.println("Started Thread C");
        threadC.start();
        System.out.println("End Of Main THread");

    }
}