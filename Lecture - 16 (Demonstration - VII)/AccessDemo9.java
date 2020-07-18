class A{
    public void msg1(){
        System.out.println("Class A : public ");
    }
    private void msg2(){
        System.out.println("Class A : Private !");
    }
    protected void msg3(){
        System.out.println("Class A: Protected !");
    }
}
public class AccessDemo9 extends A{
    void msg(){
        System.out.println("Class Main : Welcome");
    }
    public void msg1(){// if modifire is set to default it cannot  override
        System.out.println("OverLoading public method");
    }
    void msg2(){
        System.out.println("Overridding public method");
    }
    // if modifire is set to private it  can be overridden
    public void msg3(){
        System.out.println("Overriding protected method !");
    }
    public static void main(String args[]){
        AccessDemo9 obj = new AccessDemo9();
        obj.msg();
        obj.msg1();
        obj.msg2();
        obj.msg3();
        
    }
}