//Ex - 1 of Default access modifier
class A{
    void msg(){
        System.out.println("Hi ! I am class A");
    }
}
class AccessModiDemo1{
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
    }
}