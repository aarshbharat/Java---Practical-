
import java.lang.*;
class Calculator{
    double i;
    double x = Math.sqrt(i);
}
class CommandLine3{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.i = Integer.parseInt(args[0]);
        System.out.println("Square root of "+c.i+" is "+c.x);
    }
}