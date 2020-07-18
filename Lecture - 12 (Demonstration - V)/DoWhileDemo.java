//DowhileLoop Demo
class DoWhileDemo{
    public static void main(String[] args) {
        int count = 1;
        System.out.println("Print first 10 even numbers : ");
        do {
            System.out.print(" "+2*count);
            count++;    
        } while (count < 11);
    }
}