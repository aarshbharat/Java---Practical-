import java.util.Scanner;
class ScannerDemo1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        
        System.out.println("Enter Your Num1 : ");
        a = s.nextInt();
        System.out.println("Enter Your Num2 : ");
        b = s.nextInt();
        if(a > b){
            System.out.println("Maximum Num is "+a);
        }
        else{
            System.out.println("Maximum Num is "+b);
        }
    }
}