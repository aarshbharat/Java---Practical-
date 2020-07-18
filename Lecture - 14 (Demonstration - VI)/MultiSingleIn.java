import java.util.Date;

class Person{
    String name;
    Date dob;
    int mobileNo;
    void readDate(String n,Date d,int m){
        name = n;
        dob = d;
        mobileNo = m;
    }
    void printData(){
        System.out.println("Name : "+name);
         dob.printDate();
         System.out.println("Mobile : "+mobileNo);
    }
}

class Student extends Person{
    String institution;
    int [] qualif = new int [20];
    int rollno;
    int [] marks = new int [5];
    
    void printBioData(){
       // printData();
        System.out.println("Institution : "+institution);
        System.out.println("Roll No. : "+rollno);
        for(int i = 0; i < qualif.length; i++){
            System.out.println("Mraks "+i+" : "+qualif[i]);
        }
        for(int j=0;j<marks.length;j++){
            System.out.println("Result "+j+" : "+marks[j]);
        }
    }
}
class Employee extends Person{
    int empNo;
    int [] salaryHistory = new int[12];
    String Organization;
    String designation;
    Date doj;
    void printSalary(){
        for(int s = 0; s<salaryHistory.length;s++){
            System.out.println("Salary :"+s+": "+salaryHistory[s]);
        }
    }
}
class MultiSingleIn{
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        Employee e = new Employee();

    }
} 