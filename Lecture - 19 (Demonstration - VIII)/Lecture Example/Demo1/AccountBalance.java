import MyPack.Balance;
class AccountBalance{
    public static void main(String args[]){
        Balance current[] = new Balance[3];
        current[0] = new Balance("Aarsh",123.25);
        current[1] = new Balance("Bharat",157.33);
        current[2] = new Balance("Bharati",-123.22);
        for(int i = 0;i<3;i++){
           current[i].show();
        }
    }
}