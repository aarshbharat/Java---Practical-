//static method 
class Circle1{
    
    static int circlecount = 0; // class variable
    public double x,y,r; // instance variable 
    public Circle1(double x,double y,double r){
        this.x = x;
        this.y = y;
        this.r = r;
      //  circlecount++;
    }   
    public Circle1(double r){
        this(0.0,0.0,r);
        circlecount++;
    }
    public Circle1(Circle1 c){
        this(c.x, c.y, c.r);
        circlecount++;
    }
    public Circle1(){
        this(0.0,0.0,0.1);
        circlecount++;
    }
    
	public Circle1 bigger(Circle1 c){
        if(c.r>r){
            return c;
        }
        else 
        return this;
    } 
    public static Circle1 bigger(Circle1 a,Circle1 b){
        if(a.r>b.r){
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {
        Circle1 a = new Circle1(2.0);
        Circle1 b = new Circle1(3.0);
        Circle1 c = a.bigger (b); // call of the instance method 
        Circle1 d = Circle1.bigger (a,b); // call of the class method     
    }
}