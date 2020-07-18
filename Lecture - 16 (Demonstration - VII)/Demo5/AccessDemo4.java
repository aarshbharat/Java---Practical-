class A{
    private int data = 40;
    public void msg(){
        System.out.println("Class A : Hello Java "+data);
    }
}
public class AccessDemo4{
    public static void main(String[] args) {
        int data2 = 100;
        A obj = new A();
        System.out.println("Class B"+" "+data2);
        obj.msg();//private data of class A can be access as member of public method of that class A
    }
   
    
} 