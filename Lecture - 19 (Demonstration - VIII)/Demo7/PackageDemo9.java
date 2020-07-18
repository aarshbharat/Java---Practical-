import MyPack.Balance;
class Savings extends Balance{
    String branch;
    int customerID;
    Savings(String n,double bal,String br,int id){
        super(n,bal);
        branch = br;
        customerID = id;
    }
    public void show(){
        if(bal < 0){
            System.out.println("Sorry ! Negative balance");
        }
        else{
            System.out.println(name+" : $"+bal+" "+branch+" "+customerID);
        }
    }    
}
class PackageDemo9{
    public static void main(String[] args) {
        Savings current[] = new Savings[3];
        current[0] = new Savings("Aarsh",123.23,"Vidyanagar",555);
        current[1] = new Savings("Om",-123.23,"Gandhidham",455);
        current[2] = new Savings("Karan",1005.23,"Changa",355);
        
        for(int i = 0;i<3;i++){
            current[i].show();
        }
    }
}