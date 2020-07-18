//An abstract class with constructor 
abstract class Base{
    Base(){
        System.out.println("Base Constructor is called");
    }
    abstract void fun();
}
class Derived extends Base{
    Derived(){
        super();
        System.out.println("Derived Constructor is called");
    }
    void fun(){
        System.out.println("Derived Fun is called");
    }
}
class AbstractDemo2{
    public static void main(String[] args) {
        Derived d = new Derived();   
        d.fun();
    }
}