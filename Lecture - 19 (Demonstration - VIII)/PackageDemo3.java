/*java program to demonstrate accessing of members when it is not imported explicitly*/
public class PackageDemo3 {
    public PackageDemo3(){
        java.util.ArrayList newList = new java.util.ArrayList();
        //java.util.ArrayList is not imported, hence we reffering to it using the complete package.
        //the code dealing with the object newList
    }
    public static void main(String[] args) {
        //here is the code in main class..
    }

}