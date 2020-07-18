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
}
class TestException{
    public static void main(String args[]){
        int a,b,c;
        int x,y;
        try{
            x = a / (b-c);
        }catch(ArithmeticException e){
            System.out.println("b = c : divide by zero error....!");    
        }
        y = a / (b+c);
        System.out.println("y = "+y);
    }
}