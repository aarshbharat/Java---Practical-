import myPack.*;

public class AccountBalance {
    public static void main(String[] args) {
        Balance current [] = new Balance[3];
        current[0] = new Balance("Aarsh",125.16);
        current[1] = new Balance("Aarsh",123.13);
        current[2] = new Balance("Aarsh",-124.25);

        for(int i = 0; i<3; i++){
            current[i].show();
        }
    }
}