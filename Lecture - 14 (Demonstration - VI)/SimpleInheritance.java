class Point2D{
    int x ,y;
    void display(){
        System.out.println("x = "+x+" y = "+y);
    }
}
class Point3D extends Point2D{
    int z;
    void display(){
        System.out.println("x = "+x+" y = "+y+" z = "+z);  
    }
    
}
class SimpleInheritance{
    public static void main(String[] args) {
        Point3D x = new Point3D();
        x.x=10;
        x.y=20;
        x.z=30;
        x.display(); 
    }
}