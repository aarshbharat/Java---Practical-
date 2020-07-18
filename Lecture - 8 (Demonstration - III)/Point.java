//How to initialize some data in simple class 
class PointDeclaration{
    int x;
    int y;
}

class Point{
    public static void main(String[] args) {
        PointDeclaration mypoint = new PointDeclaration();

        mypoint.x = 10;
        mypoint.y = 20;
        System.out.println("X "+ mypoint.x);
        System.out.println("Y "+ mypoint.y);
    }
}