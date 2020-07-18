//Fibonaci Series using Recursive method
class RecursiveFibonaci{
    int n;
    int fibonaci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else {
                return(fibonaci(n-1)+fibonaci(n-2));
        }
    }
    public static void main(String[] args) {
        RecursiveFibonaci x = new RecursiveFibonaci();
        x.n = Integer.parseInt(args[0]);
        for(int i = 0; i<x.n; i++){
            System.out.println(x.fibonaci(i));
        }
    }
}