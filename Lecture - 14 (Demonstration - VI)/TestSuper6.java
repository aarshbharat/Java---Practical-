//Example of Superclass variable reffering to sub class object 
class Box{
    double width;
    double height;
    double depth;
    Box(){//default constructor
    }     
    //constructor used when all dimension speciied
    Box(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width*depth*height;
    }  
}
class BoxWeight extends Box{
    double weight; //weight of Box
    //Constructor  for Boxweight 
    BoxWeight(double w, double h,double d,double m){
        width = w; 
        height = h;
        depth = d;
        weight = m; 
    } 
}
class TestSuper6{
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;
        vol = weightbox.volume();
        System.out.println("Volume of Weighted Box = "+vol);
        System.out.println("Weight of Box = "+weightbox.weight);
        System.out.println();
        //assign Boxweight referance to Box referance  
        plainbox = weightbox;
        vol = plainbox.volume(); // ok, volume() defined in box
        System.out.println("Volume of Box = "+vol);
    }
}