class ScopeOfVariable3{
    public static void main(String[] args) {
        int x;
        x = 10;
        if(x == 10){
            int y = 20;
            System.out.println("x and y : "+ x + " "+ y);
            x = y * 2;
        }
      //  y = 100;// if you uncomment this satetement it gives Error out of Scope
        System.out.println("x is "+x);
    }
}