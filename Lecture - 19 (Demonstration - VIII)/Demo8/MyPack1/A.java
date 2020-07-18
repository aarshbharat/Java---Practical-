package MyPack1;
//import MyPack1.X;
public class A { 	        // class with default protections
	public A() {   	        // default constructor with default access
	X x = new X();    // create an object of class X	
	System.out.println("Same package constructor ....");
	System.out.println("n from A"+x.n);  
	// Default variable is accessible in the same package
	//System.out.println("p from A"+x.p);	// Error 
    //System.out.println("q from A"+x.q);	//Error 
	 System.out.println("r from A"+x.r); // OK: public 
	}
}