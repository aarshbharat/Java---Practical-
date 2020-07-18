//Fibonaci Series using iterative method
class SimpleFibonaci{
    public static void main(String[] args) throws NumberFormatException {
        int n;
        n = Integer.parseInt(args[0]);
        int a = 0; int b = 1;
        System.out.print(a+" "+b);
        for(int i = 2;i<n;++i){
            int c = a + b;
            System.out.print(" "+c);
            a=b; b=c; 
        }
    }
}