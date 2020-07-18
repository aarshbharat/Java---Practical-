//Dynamic Method Dispatch - Runtime Polymorphism Understanding
class Bike{
    void run(){
        System.out.println("Running.....");
    }
}
class Splender extends Bike{
    void run(){
        System.out.println("Running safely with 60km per hour");
    }
}

class RunPolyDemo{
    public static void main(String[] args) {
        Splender b1 = new Splender();
        b1.run();
        Bike b2 = new Bike();
        b2.run();
        Bike b3 = new Splender(); // upcasting
        b3.run();
     /*  Splender b4 = new Bike();
         b4.run();
         - above statements are not possible and it gives compile time error like
            error: incompatible types: Bike cannot be converted to Splender
            because downcasting is not possible here. 
    */
    }
}