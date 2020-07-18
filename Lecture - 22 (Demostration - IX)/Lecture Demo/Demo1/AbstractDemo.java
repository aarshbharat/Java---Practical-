import myShape.*;
class AbstractDemo {
    public static void main(String[] args) {
        Geometry [] geoObj  = new Geometry[3];
        geoObj [0] = new Circle(2.0);
        geoObj [1] = new Rectangle(1.0,3.0);
        geoObj [2] = new Ellipse(4.0,2.0);
        double totalArea = 0;
        for(int i=0; i<3;i++){
            totalArea = totalArea + geoObj[i].area();
        }
        System.out.println("Total Area = "+totalArea);
    }
}