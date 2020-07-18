import java.lang.*;
class InterruptedException extends Exception{
    InterruptedException(String message){
        super(message); 
    }
}
class ThrowDemo1{
    static void demoProc(){
        try{
            throw new InterruptedException("An Intrrupt occurred");
            //An Exception object is created 
            //Some code for demoProc() is here 
        }
        catch(InterruptedException e){
            System.out.println("Exception is caught in demoProc()");
            throw e; //Exception will be thrown to the caller of demoProc()
        }
    }
    public static void main(String []args){
        try{
            demoProc();
        }catch(Exception e){
            System.out.println("Exception thrown by demoProc() is caught here");
        }
    }
} 