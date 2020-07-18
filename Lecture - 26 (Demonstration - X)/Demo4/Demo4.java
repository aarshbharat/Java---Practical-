//Finally in try catch block
class Demo4{
    public static void main(String [] args){
        int i = 0;
        String greetings[] = {"Hello Man","Hello Java","Hello World"};
        while(i<4){
            try{
                System.out.println(greetings[i]);
                i++;
            }catch(Exception e){
                System.out.println(e.toString());
                                    // Message of exception e in string format
            }finally{
                System.out.println("Hi !");
                if(i<3);
                else{System.out.println("You Should quit and index value");break;}
            }
        }
    }
}