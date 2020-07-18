//Basic understanding of Abstract Class 
abstract class Bike{
    abstract void run();
}
class Honda extends Bike{
    void run(){
        System.out.println("Running Safely");
    }
}
class AbstractDemo{
    public static void main(String[] args) {
        Bike b = new Honda();
        b.run();
    }
}