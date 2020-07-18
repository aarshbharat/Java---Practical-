//Dynamic Binding in Java
class A{
    void callMe(){
        System.out.print("I am From A");
    }
}
class B extends A{
    void callMe(){
        System.out.println("I am From B");
    }
}
class Who{
    public static void main(String[] args) {
        A a = new B();
        a.callMe();
        B b = new B();
        b.callMe();
    }
}