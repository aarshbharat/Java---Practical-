/*An interface mrthod cannot be made final */
interface I1{
    public static int i = 555;
    //public static final void printInterface(); // here final keyword gives an error 
    public void printInterface();
}
//The Following code is invalid 
class C implements I1{
    public static int j = 111;
    public void printInterface(){
        System.out.println("Geek !");
    }
} 