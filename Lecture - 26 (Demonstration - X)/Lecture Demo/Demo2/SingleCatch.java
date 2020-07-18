import java.lang.*;
class SingleCatch{
    public static int j;
    public static void main(String args[]){
        for(int i = 0;i<4;i++){
        try{
            switch(i){
                case 0 :
                    int zero = 0;
                    j = 99 / zero; //divide by 0 error
                    break;
                case 1 : 
                    int b[] = null;
                    j = b[0]; //null pointer error 
                    break;
                case 2 : 
                    int c[] = new int[2];
                    j = c[10]; // Array index is out of bound error 
                    break;
                case 3 :
                    char ch = "Java".charAt(9); //String index out of bound error
                    break; 
            }
            
        }catch(Exception e){
                System.out.println("In Test Case#"+i+"\n");
                System.out.println(e.getMessage());
            
        }
    }
}
}