class A{
    protected void display(){
        System.out.println("Aarsh With Java");
    }
}
class AccessDemo6 extends A{
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}