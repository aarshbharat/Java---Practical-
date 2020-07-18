class A{
    int i;//default
    protected int j;//private 
    void setij(int x,int y){
        i = x;
        j = y;
    }
}
class B extends A{
    int total;
    void sum(){
        total = i + j; // j is not accesible here
    }
}
class AccessDemo7{
    public static void main(String[] args) {
        B subOb = new B();
    //        A obj = new A();
        subOb.setij(10,20);  
        subOb.sum();
        System.out.println("Total = "+subOb.total);
    }
}