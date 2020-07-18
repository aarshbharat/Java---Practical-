interface A{
    void meth1();
    void meth2();
}
interface B extends A{
    void meth3();
}
class MyClass implements B{
    public void meth1(){
        System.out.println("Meth1 is call");
    }
    public void meth2(){
        System.out.println("Meth2 is call");
    }
    public void meth3(){
        System.out.println("Meth3 is called");
    }
}
class InterFaceInheritance{
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }

}