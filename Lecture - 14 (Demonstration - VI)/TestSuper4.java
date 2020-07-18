class Point2D{
    double x,y;
    Point2D(){
        x = 2.0; y = 3.0; //defualt intialization
    }
    Point2D(double x,double y){
        this.x = x;
        this.y = y;
    }
}
class Point3D extends Point2D{
    double z;
    Point3D(){
        super();
        z = 0.0;//default intialization
    }
    Point3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }
    void display(){
        System.out.println("(x,y,z)"+"="+"("+x+","+y+","+z+")");
    }
}
class TestSuper4{
    public static void main(String[] args) {
        Point3D p = new Point3D(3.0,4.0,5.0);
        p.display();
    }
}
