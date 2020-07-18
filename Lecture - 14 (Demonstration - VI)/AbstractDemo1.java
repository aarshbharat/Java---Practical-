//A simple Abstract class Demo
abstract class Base{
    abstract void fun();
}
class Derived extends Base{
    void fun(){
        System.out.println("Derived fun() is called");
    }
}
class AbstractDemo1{
    public static void main(String[] args) {
        //we cannot create object of abstract class 
        // it means we can not write statement like this 
        //Base b = new Base();
        //above statement gives an error at compile time 
        Base b = new Derived();
        b.fun();
    }
}