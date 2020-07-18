import java.util.*;
class ExceptionDemo1{
    static int anyFunction(int x,int y){
        try{
            int a = x/y;
            //String infinity = "Infinity";
            return(a);
        }catch(ArithmeticException e){
            System.out.println("a=x/y is bypassed...Enter y as non-zero");
            return 0;
        }
    }
    public static void main(String args[]){
            int result = anyFunction(25,0);
            System.out.println("Result : "+result);
    }
       
}