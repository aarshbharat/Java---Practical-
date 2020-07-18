class ScopeOfVariable{
    public static void main(String[] args) {
       
        {
            //The Variable x has scope within brackets
             x = 10;
            System.out.println(x);
        }
        //If you uncommet this line then it will produce error
        //System.out.println(x);
    }
}