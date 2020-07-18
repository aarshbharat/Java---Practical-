//constructor overloading and use of this keyword with multiple constructors
class Circle{
    double x,y,r;
    Circle(double x,double y,double r){
        this.x = x; 
        this.y = y;
        this.r = r;
    }
    Circle(double r){
        this(0.0,0.0,r);
    }
    Circle(Circle c){
        this(c.x,c.y,c.r);
    }
    Circle(){
        this(0.0,0.0,1.0);
    }
    double circumference(){
        return 2*3.14159*r;
    }
    double area(){
        return (22/7)*r*r;
    }
    
}
public class CircleDemo3{
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0,4.0,5.0);
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(c1);
        Circle c4 = new Circle();

        System.out.println("Circumference of Circle 1 : "+c1.circumference());
        System.out.println("Area of Circle 2 :"+c1.area());
        System.out.println("Circumference of Circle 2 : "+c2.circumference());
        System.out.println("Area of Circle 2 : "+ c2.area());
        System.out.println("Circumference of Circle 3 : "+c3.circumference());
        System.out.println("Area of Circle 3 : "+c3.area());
        System.out.println("Circumference of Circle 4 : "+ c4.circumference());
        System.out.println("Area of Circle 4 :"+ c4.area());
    }

}