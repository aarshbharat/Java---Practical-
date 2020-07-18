class BaseClass{
    public int x = 10;
    private int y = 10;
    protected int z = 10;
    int  a = 10;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    private int getY(){
        return y;
    }
    private int setY(int y){
        return this.y = y;
    }
    protected int getZ(){
        return z;
    }
    protected int setZ(int z){
        return this.z = z;
    }
    int getA(){
        return a;
    }
    void setA(int a){
        this.a = a;
    }
}
class AccessDemo8 extends BaseClass{
    public static void main(String args[]){
        BaseClass rr = new BaseClass();
        rr.z = 0;
        AccessDemo8 subClassobj = new AccessDemo8();
        System.out.println("value of x is : "+ subClassobj.x);
        subClassobj.setX(10);
        System.out.println("Value of x is : "+ subClassobj.x);

        System.out.println("Value of z is : "+ subClassobj.z);
        subClassobj.setZ(30);
        System.out.println("Value of Z is : "+ subClassobj.z);

        System.out.println("Value of a is : "+subClassobj.a);
        subClassobj.setA(20);
        System.out.println("value of a is : "+ subClassobj.a);
    }

}