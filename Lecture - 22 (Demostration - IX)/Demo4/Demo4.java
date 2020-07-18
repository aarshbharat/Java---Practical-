/*We have leaarnt that a class must implements an interface and then thaat class will be used as a
normal class. However, the reversse is not true. that, interce can't impement nother interfaace
 */
interface I1{
    public static int i = 100;
    void printInterace();
}
//The Following code is invalid 
/*interface I2 implements I1{
    public static int j = 111;
    public void printInterace(){
        System.out.println("Geel !");
    }
}*/

class I2 implements I1{
    public static int j = 111;
    public void printInterace(){
        System.out.println("Geek !");
    }
}