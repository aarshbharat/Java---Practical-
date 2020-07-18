//Break Demonstration
class BreakDemo{
    public static void main(String[] args) {
        for(int i=1; ;i++){
            if(i%10 == 0) break;// terminates the loop when i = 10
            System.out.println("i : "+i);
        }
        System.out.println("Loop Completed");
    }
}