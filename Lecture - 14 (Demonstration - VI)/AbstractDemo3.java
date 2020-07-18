//abstract class without non abstract method
abstract class Base{
    void fun(){
        System.out.println("Base fun() is called");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("Derived Constructor is called");
    }
    void fun(){
        super.fun();
        System.out.println("Derived fun() is called....");
    }
}
class AbstractDemo3{
    public static void main(String[] args) {
        Derived d = new Derived();
        d.fun();
    }
}