//an abstract class with a final method 
abstract class Base{
    final void run(){
        System.out.println("Final fun() is called");
    }
}
class Derived extends Base{
}
class FinalDemo2{
    public static void main(String[] args) {
        Base b = new Derived();
        b.run();
    }
}
/**
 * if we declared a method using final keyword we cannot override it and if we try to 
    override it will gives an error and we cannot execute a code. 
 */