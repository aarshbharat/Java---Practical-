class NestedTryCatch{
    public static void main(String [] args){
        try {
            //to catch divide by zero
            int a = args.length;
            int b = 42 / a;
            //divide by zero exception 
            System.out.println("a = "+a);
            if(a == 1)
                a = a/(a-a);
            //another divede by zero
            try {
                // nested try block
                if(a==2){
                    //if two command line args used, then array index out of bounds exception
                    int c[] = {1};
                    c[a]=99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index is out of bound : "+e);
            }
        } catch (ArithmeticException e) {
           System.out.println("Divide by zero : "+e);
        }
    }
}