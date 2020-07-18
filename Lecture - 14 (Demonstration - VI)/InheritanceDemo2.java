//Inheritance Example : Intializing sub class object using super class constructor 
class Box{
    double width;
    double height;
    double depth;
    //Default Constructor
    Box(){
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }
    Box(double w, double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    //compute and return volume
    double volume(){
        return width*depth*height;
    }
}
// Here, BOx is extended to include weight 
class BoxWeight extends Box{
    double weight;
    //default constructor for BoxWeight
    BoxWeight(){ 
        super();// call the default constructor in super class 
        weight = 0.0;
    }
    BoxWeight(double w,double h,double d,double m){
        super(w,h,d);//call the overloaded constructor of super class
        weight = m;
    }
}

class InheritanceDemo2{
    public static void main(String[] args) {
        Box box1 = new Box(10,20,30);
        BoxWeight box2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = box1.volume();
        System.out.println("Volume of Box1 = "+vol);
        System.out.println();
        vol = box2.volume();
        System.out.println("Volume of Box2 = "+vol);
        System.out.println("Weight of Box2 = "+box2.weight);
    }
}