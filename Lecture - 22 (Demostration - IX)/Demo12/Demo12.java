import myinterface.*;

public class Demo12 {
    public static void main(String[] args) {
        //use the above class defination
        Geometry [] geoObjects = new Geometry[3];
        //create an array to hold Geometry objects 
        geoObjects [0] = new Circle(2.0);
        geoObjects [1] = new RectAngle(1.0,3.0);
        geoObjects [2] = new Ellipse(4.0, 2.0);
        double totalArea = 0;
        for (int i = 0; i<3; i++){
            totalArea = totalArea + geoObjects[i].area();
        }
        System.out.println("Total area of the geo-objects is "+totalArea);

     }
}