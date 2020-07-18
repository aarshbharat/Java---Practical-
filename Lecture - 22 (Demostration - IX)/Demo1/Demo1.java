import myinterface.AnInterface;

class Demo1 implements AnInterface{
    
    public void display(){
        System.out.println("Fine!");
    }
    //The main method
    public static void main(String args []){
        Demo1 t = new Demo1();
        t.display();
        System.out.println("The Final Value a in myInterface "+a);
    }

}

   
