class B {
    B(){
        MyPackage1.X x = new MyPackage1.X();
        //create an object of X
        System.out.println("I am a constructor from class B of MyPackage2");
       // System.out.println("n from B of MyPackage2 = "+x.n);
        //default variable but not accessible in this package
        //System.out.println("p from B of MyPackage2 = "+x.p);
        //error
        //System.out.println("q from B of MyPackage2 = "+x.q);
        //Error Protection 
        System.out.println("r from B of MyPackage2 = "+x.r);
    }
}