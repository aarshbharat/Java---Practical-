class CommandLineInput{
    public static void main(String[] args) {
        int number,invalidCount = 0, validCount = 0;
        for (int i = 0;i<args.length;i++){
            try{
                 number = Integer.parseInt(args[i]);
            }
            catch(NumberFormatException e){
                 System.out.println("Number at "+i+" "+args[i]);
            }
            validCount++;
            System.out.println("Valid number at "+i+" "+args[i]);
        }
        System.out.println("Invalid entries : "+invalidCount);
        System.out.println("Valid entries: "+validCount);
    }
}