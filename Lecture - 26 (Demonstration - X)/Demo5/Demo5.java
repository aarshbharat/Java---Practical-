//use throw clause in java
import java.lang.*;
public class Demo5{
    public static void main(String[] args) throws Exception {
        int[] array = new int[3];
        try{
            for(int i = 0;i<4;++i){
                array[i]=i;
            }
            System.out.println(array);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("filIn : "+e.fillInStackTrace());
            System.out.println("cause : "+e.getCause());
            System.out.println("Local : "+e.getLocalizedMessage());
            System.out.println("message : "+e.getMessage());
            System.out.println("Trace : "+e.getStackTrace());
            System.out.println();
            System.out.println();
            System.out.println("trace: "); e.printStackTrace();
            System.out.println();
            System.out.println("String: "); e.toString();
            System.out.println();
            System.out.println();
            //printed just to inform that we have entered the catch block
            System.out.println("Oops, we went too far, better go back to 0");
            throw(Exception) new Exception().initCause(e); 
        }finally{
            System.out.println(array);
            //method call to continue program 
        }
    }
}