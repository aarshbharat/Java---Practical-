//nested try catch
class Demo6{
    public static void main(String[] args) {
        try{
            //To catch divide by zero
            int a = args.length;
            int b = 42/a;
            //divide by zero exception
            System.out.println("a = "+a);
            if(a==1)
                a = a/(a-a);
            //another divide by zero exception
            try{
                //nested try block
                if(a==2){
                    //If two command line arguments are used, then array index out of bound exception occurs
                    int c[] = {1};
                    c[2] = 99;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index Out Of Bounds : "+e);
            }
        }catch(ArithmeticException e){
            System.out.println("Divide by zero: "+e);
        }
    }
}