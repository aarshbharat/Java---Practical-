class Circle{
    double x,y,r;
    double circumference(){
        return 2*3.14159*r;
    }
    double area(){
        return (22/7)*r*r;
    }
    void setCircle(double a,double b,double c){
        x = a;
        y = b;
        r = c;
    }

}

class CircleDemo{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.setCircle(3.0,4.0,5.0);
        c2.setCircle(-4.0,8.0,10.0);

        System.out.println("Circumferemce Of Circle 1 = "+c1.circumference());
        System.out.println("Area of Circle 1 = "+c1.area());
        System.out.println("Circumferemce Of Circle 2 = "+c2.circumference());
        System.out.println("Area of Circle 2 = "+c2.area());
    }
}