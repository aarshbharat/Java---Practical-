//Nested Class Implementation
class Circle{
    static double x,y,r;
    Circle(double r){
        this.r = r;
    }
    //following is the nested class
    public static class Point{
        double x,y;
        void display(){
            System.out.println("(x,y) : ("+this.x+","+this.y+")");
        }
    
       Point(double a, double b){
          this.x = a;
          this.y = b;
        }
    }

    public boolean isInside(Point P){
        double dx = P.x;
        double dy = P.y;
        double distance = Math.sqrt((dx*dx)+(dy*dy));
        System.out.println("Distance = "+distance);
        if(distance > r) {
            return false;
        }
        else {
            return true;
        } 
    }
    public static void main(String[] args) {
        Circle a = new Circle(3.0);
        Point pa = new Point(1.0,2.0);
        pa.display();
        System.out.println("is the points (1,2) inside the circle with radius 2 : "+a.isInside(pa));
        Circle b = new Circle(1.0);
        Point pb = new Point(4.0,4.0);
        pb.display();
        System.out.println("is the points (3,3) inside the circle with radius 1 : "+b.isInside(pb));
    }
}