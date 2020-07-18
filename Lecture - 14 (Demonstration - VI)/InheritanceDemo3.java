//Example of multilevel inheritance
class Box{
    private double width;
    private double height;
    private double depth;
    //constructor used when all dimension specified
    Box(double w, double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    //compute and return volume
    double volume(){
        return width*height*depth;
    }
}
class BoxWeight extends Box{
    double weight; 
    BoxWeight(double w,double h,double d,double m){
        super(w,h,d);
            weight = m;
    }
}
class Shipment extends BoxWeight{
    double cost;
    Shipment(double w,double h,double d,double m,double c){
        super(w, h, d, m);
        cost = c;
    }
} 
class InheritanceDemo3{
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("Volume of shipment1 : "+vol);
        System.out.println("Weight of Shipment1 : "+shipment1.weight);
        System.out.println("Shipping Cost : $"+shipment1.cost);

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 : "+vol);
        System.out.println("Weight of Shipment2 : "+shipment2.weight);
        System.out.println("Shipping Cost : $"+shipment2.cost);
    }
}
