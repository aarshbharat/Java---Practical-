import java.lang.*;
class MyException extends Exception{
    MyException(String message){
        super(message); 
    }
}
class ThrowDemo{
    public static void main(String args[]){
        int x = 5, y = 1000;
        try{
            float z = (float) x/(float)y;
            if (z < 0.01) throw new MyException("Given Data are not proper");
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("It Prints Always");
        }
    }
}