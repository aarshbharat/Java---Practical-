//How to initialize some data in simple class 
class PointDeclaration{
    int x,y;
    void setPoint(){
        x = 10; y = 20;
    }
    void setPoint(int a,int b){
        x = a; y = b;
    }
}

class Point1{
    public static void main(String[] args) {
        float distance;
        PointDeclaration p = new PointDeclaration();
        p.setPoint();
        p.setPoint(15,10);

        System.out.println("X "+ p.x);
        System.out.println("Y "+ p.y);
    }
}