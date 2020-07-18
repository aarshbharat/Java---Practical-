package MyPackage1;
class Y extends X{
    public Y(){
        System.out.println("I am a Constructor from class Y");
        System.out.println("n="+n);
       /*
         System.out.println("p="+p);
         error p is a private member of X.not accessible outside x.
        */ 
        System.out.println("q="+q);//protected is accessible 
        System.out.println("r="+r);//public is accessible
    }
}