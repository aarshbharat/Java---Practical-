//import myPack1.MyClass;
//import myPack2.MyClass;

class PackageDemo8 {
    public static void main(String[] args) {
        myPack1.MyClass a = new myPack1.MyClass();
        myPack2.MyClass b = new myPack2.MyClass();
        a.msg1();
        b.msg2();
    }
}