//Accessing a package Demorfom a java built in APIs
import java.lang.*;// Math class is defined in this package
class Calculator{
    double i;
    double x;
    void p(){
        x = Math.sqrt(i);
    }
}
class PackageDemo1 {
    public static void main(String args[]){
        Calculator cal = new Calculator();
        cal.i = 25;
        cal.p();
        System.out.println("Square root of "+cal.i+" is "+cal.x);
    }
}