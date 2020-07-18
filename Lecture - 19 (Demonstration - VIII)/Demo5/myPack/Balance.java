package myPack;

public class Balance {
    String name;
    double bal;

    public Balance(String n,double d){
        name = n;
        bal = d;
    }
    public void show(){
        if (bal<0){
            System.out.println(name+" Your Account is Dead because of Negative Balance");
        }
        else{
            System.out.println(name+" : $ "+bal);
        }
    }
}