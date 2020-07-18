package MyPack;

public class Balance {
    protected String name;
    protected double bal;

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