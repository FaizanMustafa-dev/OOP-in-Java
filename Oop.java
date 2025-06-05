import java.util.Scanner;

class Persons{
protected String name;
protected int age;
Scanner s1 = new Scanner(System.in);
Persons(){
  
  System.out.println("Enter your name : ");
  name=s1.nextLine();
  System.out.println("Enter your age : ");
  age=s1.nextInt();
}
public void print_output(){
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
}
}
class Student extends Persons{
protected String reg_no;
protected String program;
Scanner s2=new Scanner(System.in);
Student(){
    super();
  
  System.out.println("Enter your reg_no : ");
  reg_no=s2.nextLine();
  System.out.println("Enter your program : ");
  program=s2.nextLine();
  
}
public void output(){
    super.print_output();
     System.out.println("The reg no : "+reg_no);
    System.out.println("Program : "+program);
    
}
}
class UGStudent extends Student{
    private String internship;
    private String  mode;
         Scanner s3=new Scanner(System.in);
   UGStudent(){
    super();

     System.out.println("Enter the mode of internship : ");
     mode=s3.nextLine();
     System.out.println("Enter you want internship or not : ");
     internship=s3.nextLine();
   }
   public void print_info(){
    super.output();
    System.out.println("The intership mode is :"+mode);
    System.out.println("Internship :"+internship);

   }
}

class Oop{
    public static void main(String []args){
       UGStudent S1=new UGStudent();
       S1.print_info();
    }
}