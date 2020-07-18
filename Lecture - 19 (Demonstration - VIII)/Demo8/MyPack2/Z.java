package MyPack2;
//import Mypack1.*;
public class Z extends MyPack1.X{
    public Z(){
        System.out.println("I am From class Z");
      //  System.out.println("n from Z = "+n);//error
        //default is not accessible outside its package
        //System.out.println("p from Z = "+p);
        System.out.println("q from Z = "+q);
            //protected member is accessible by inheritance     
        System.out.println("r from Z = "+r);
            // public is accessible
    }
}