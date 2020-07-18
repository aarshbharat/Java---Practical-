class A{
    protected int rollNo = 55;
    protected void msg(){
        System.out.println("Class A : Hello Java "+rollNo);
    } 
}
class AccessDemo5{
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
        System.out.println("Class A : "+obj.rollNo); 
    }
}j