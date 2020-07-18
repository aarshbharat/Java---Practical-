interface GeoAnalzer{
    final static float pi = 3.1416F;
    float area();
    float perimeter();
}
class Circle implements GeoAnalzer{
    float radius;
    Circle(float r){
        radius = r;
    }
    public float area(){
        return (pi*radius*radius);
    }
    public float perimeter(){
        return (2*pi*radius);
    }
}
class Ellipse implements GeoAnalzer{
    float major;
    float minor;
    Ellipse(float m, float n){
        major = m;
        minor = n;
    }
    public float area(){
        return (pi*major*major);
    }
    public float perimeter(){
        return (pi*(major+minor));
    }
}
class Rectangle implements GeoAnalzer{
    float length;
    float width;
    Rectangle(float l,float w){
        length = l;
        width = w;
    }
    public float area(){
        return (length*width);
    }
    public float perimeter(){
        return (2*(length+width));
    }
}
class Geometry{
    static void display(float x,float y){
        System.out.println("Area = "+x+"Perimeter = "+y);
    }
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Ellipse e = new Ellipse(5, 4);
        Rectangle r = new Rectangle(10, 5);
        GeoAnalzer geoItem;
        geoItem = c;
        display(geoItem.area(), geoItem.perimeter());
        geoItem = e;
        display(geoItem.area(),geoItem.perimeter());
        geoItem = r;
        display(geoItem.area(),geoItem.perimeter());
    }
}