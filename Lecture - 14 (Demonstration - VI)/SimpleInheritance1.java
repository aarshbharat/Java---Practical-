import javax.crypto.ShortBufferException;

class A{
    int i,j;
    void showij(){
    System.out.println("i and j = "+i+" "+j);
    }
}

class B extends A{
    int k;
    void showk(){
        System.out.println("k: "+k);
    }
    void sum(){
        System.out.println("\ni+j+k : " + (i+j+k));
    }
}
class SimpleInheritance1{
    public static void main(String[] args) {
        A supO = new A();
        B subO = new B();
        supO.i = 10;
        supO.j = 20;
        System.out.println("Contents of Super Class object");
        supO.showij();
        System.out.println();

        subO.i = 7;
        subO.j = 8;
        subO.k = 9;
        System.out.println("Content Of Sub Class object");
        subO.showij();
        subO.showk();
        System.out.println();
        System.out.print("Sum of i, j and k in Sub class object");
        subO.sum();
    }
}