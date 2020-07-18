//Use of Yeild(), stop(),and sleep() methods
class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            if(i==1) yield();
            System.out.println("From Thread A : i = "+ i);
        }
        System.out.println("........Exiting From Thread A");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("Start Thread B.....");
        for(int j=1;j<=5;j++){
             System.out.println("From Thread B : j = "+j);
            if(j==2) stop();
        }
        System.out.println(".....Exiting Thread B");
    }
}
class C extends Thread{
    public void run(){
        System.out.println("Start THread C....");
        for(int k=1;k<=5;k++){
            System.out.println("From Thread C : j = "+k);
            if(k==3){
                try{
                    sleep(5000); //1000 mili second = 1sec
                }catch(Exception e){}
            }
        }
        System.out.println(".....Exiting Thread C");
    }
}
class ThreadDemo4{
    public static void main(String[]args){
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();
        t1.start(); t2.start(); t3.start();
        System.out.println(".....End Of Execution");  
    }
}