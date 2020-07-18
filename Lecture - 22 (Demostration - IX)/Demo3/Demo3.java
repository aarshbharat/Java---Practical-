interface I1{
    public static final double PI = 3.1413434567;//OK
    static final double lambda = 0.04;//ok : public is implicit
    //int x; //declaration of any instant variable is not allowed 
    int x = 100; // intialization of any variable is necessary 
    //private static final int p = 444;
    //Error : private /protected  is not allowed 
    //abstract public static void methodd I1();//static method is not allowed 
    void methodI2();//public abstract by default
}

class A1 implements I1{
    public int a1 = 555;
    public void methodI1(){
        System.out.println("From I1 "+PI);
    }
    public void methodI2(){
        System.out.println("Again from I1 "+lambda);
    }
}
public class Demo3{
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.methodI1();
        a1.methodI2(); 
    }
}