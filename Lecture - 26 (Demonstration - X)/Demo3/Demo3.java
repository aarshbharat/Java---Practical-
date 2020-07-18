class Demo3{
    public static int j;
    public static void main(String [] args){
        for(int i = 0;i < 4;i++){
            try{
                switch (i) {
                    case 0:
                        int zero = 0;
                        j = 999/zero; //Divide by zero 
                        break;
                    case 1:
                        int b[] = null;
                        j = b[2]; //Null Pointer Exception
                        break;
                    case 2:
                        int c[] = new int [2];
                        j = c [10]; // Array Index out of bound
                    case 3: 
                        char ch = "Java".charAt(9); //String Index out of bound 
                        break;
                }
            }catch(Exception e){
                System.out.println("In Test case#"+i+"\n");
                System.out.println(e.getMessage());
            }
        }
    }
}