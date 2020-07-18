import java.lang.Exception;
class FinallyDemo{
    public static void main(String []args){
        int i = 0;
        String greetings[] = {"Hello Aarsh","Hello Bharat", "Hello Bharati"};
        while(i<4){
            try{
                System.out.println(greetings[i++]);
            }catch(Exception e){
                System.out.println(e.toString());//message of exception e in String format
            }
            finally{
                System.out.println("You Should quit and reset index value < 3 : ");
            }
        }   
    }
}