//Final class Inheritance - An Example
final class Bike{
}
class Honda extends Bike{
    void run(){
        System.out.println("Running Safely with 100kmph");
    }
} 
class FinalDemo1{
    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
    }
}
/**this code can not run because here inthis example we created a sub class of final class so that   
 is not possible because final is very strict keyword so that we can not create sub class of this final class
 * */ 