import myinterface.*;
class Demo11{
    static void display(float x, float y){
        System.out.println("Area = "+x+" Perimeter = "+y);
    }
    public static void main(String[] args) {
        Circle c = new Circle(5.2f);
        Ellipse e = new Ellipse(4.5f,3.6f);
        RectAngle r = new RectAngle(5.6f,4.3f);
        GeoAnalyzer geoItem;
        geoItem = c;
        display(geoItem.area(),geoItem.perimeter());
        geoItem = e;
        display(geoItem.area(),geoItem.perimeter());
        geoItem = r;
        display(geoItem.area(),geoItem.perimeter()); 
    }
}