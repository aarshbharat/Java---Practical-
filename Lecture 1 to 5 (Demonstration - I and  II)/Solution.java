import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a;
            for(int k = 0; k<n; k++){
                int c = 2^k;
                sum = sum+b*c;
                System.out.print(sum+" ");
            }
        }
        in.close();
    }
}