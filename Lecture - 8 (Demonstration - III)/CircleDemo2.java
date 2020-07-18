// a program that uses the circle class
class Circle{
    double x,y; // coordinates of circle
    double r; // radious of circle
    //method returns circumference of circle
    double circumference(){
        return 2*3.14159*r;
    }
    //method that returns area 
    double area(){
        return (22/7)*r*r;
    }
}
//Main class
class CircleDemo2{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.x = 0.0;
        c1.y = 0.0;
        c1.r = 4.0;
        c2.x = -4.0;
        c2.y = -8.0;
        c2.r = 10.0;
        System.out.println("Circumference of Circle 1 : "+c1.circumference());
        System.out.println("Area of Circle 1 : "+c1.area());
        System.out.println("Circumference of Circle 1 : "+c2.circumference());
        System.out.println("Area of Circle 1 : "+c2.area());
    }
    
}