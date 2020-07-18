import java.util.*;
class MultiCatch1{
    public static void main(String [] args){
        int i = args.length; //Number of arguments in the command line 
        try{
             String myString = new String[i];
             if(args[0].equals("Java")); // #1 : If i = 0 then myString null pointer error
                System.out.println("First word is Java !");
            System.out.println("Number of arguments = "+i);
            int x = 18/i;   //#2 : Divide by zero error
            int y[] = {555,999};    // y is an error of size 2 and index 0,1    
            y[i] = x; // #3 Index is out - of - range may occur if i>1
        }
        catch(NullPointerException e ){  // to catch error #1
            System.out.println("A null pointer exception : "+e);
        }
        catch(ArithmeticException e){   //to catch error #2
            System.out.println("Divide by zero : "+e);   
        }
        catch(ArrayIndexOutofBoundsException e){ // to catch error #3
            System.out.println("Array Index out of bound : "+e);
        }
    }
}