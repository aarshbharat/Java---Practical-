class SwitchCaseDemo{
    public static void main(String[] args) throws java.io.IOException{
        char choice;
        do{
            System.out.println("Select Your Branch");
            System.out.println("1. Gandhidham");
            System.out.println("2. Adipur");
            System.out.println("3. Anjar");
            System.out.println("4. VallabhVidyanagar");
            System.out.println("5. Anand");
            choice = (char)System.in.read();
        }while(choice < '1' || choice > '5');
        System.out.println("\n");
        switch(choice){
            case '1':
            System.out.println("Welcome to our Gandhidham Branch");
            break;
            case '2':
            System.out.println("Welcome to our Adipur Branch");
            break;
            case '3':
            System.out.println("Welcome to our Anjar Branch");
            break;
            case '4':
            System.out.println("Welcome to our VallabhVidyanagar Branch");
            break;
            case '5':
            System.out.println("Welcome to our Anand Branch");
            break;
        }
    }
}