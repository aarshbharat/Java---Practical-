// Example of super to overcome name hiding
class A{
    int i;
}
//subclass
class B extends A{
    int i; // this i hides the i in A
    B(int a,int b){  
        super.i = a; // i in A
        i = b; // i in B
    }
    void Show(){
        System.out.println("i in super class : "+super.i);
        System.out.println("i in sub class : "+i);
    }
}
class TestSuper7{
    public static void main(String[] args) {
        B subOb = new B(1,2);
        subOb.Show();
    }
}