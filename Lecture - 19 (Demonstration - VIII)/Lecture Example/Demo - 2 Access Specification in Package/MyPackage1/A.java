//package MyPackage1;
class A {
    A(){
        X x = new X();
        System.out.println("Same Package Constructor");
        System.out.println("n from A = "+x.n);
        //Default variable is accessible in the same package 
       // System.out.println("p from A = "+x.p);//error
        //sSystem.out.println("q from A = "+x.q);//error protection
        System.out.println("r from A = "+x.r);//OK: public
    }
}