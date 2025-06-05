import java.util.Scanner;
class Hospital{
    protected 
     String name;
      String address;
      String patients;
Hospital(){
Scanner s1=new Scanner(System.in);
System.out.println("Enter the name : ");
name=s1.nextLine();
System.out.println("Enter the address : ");
address=s1.nextLine();
System.out.println("Enter patients : ");
patients=s1.nextLine();

}
}
class Department extends Hospital{
    protected
       String staff;
       Department(){
        super();
        Scanner s2=new Scanner (System.in);
        System.out.println("Enter staf : ");
        staff=s2.nextLine();
       }
}
class TeamMember extends Department{
     protected
       String id;
       String gender;
       String date_joined;
       TeamMember(){
        super();
        Scanner s3=new Scanner(System.in);
        System.out.println("Enter ID : ");
        id=s3.nextLine();
        System.out.println("Enter gender : ");
        gender=s3.nextLine();
        System.out.println("Enter the date to join : ");
        date_joined=s3.nextLine();
       }
}
class Doctor extends Hospital{
private 
 String speciality;
 String type;
Doctor(){
    super();
    Scanner s4=new Scanner(System.in);
    System.out.println("Enter speciality : ");
    speciality=s4.nextLine();
    System.out.println("Enter type : ");
    type=s4.nextLine();
}

}
class Patient extends Hospital{
    String birthDate;
    String gender;
    String date_admitted;
    String numofDays;
    Patient(){
        super();
        Scanner s5=new Scanner(System.in);
        System.out.println("Enter birt date : ");
        birthDate=s5.nextLine();
        System.out.println("Enter gender : ");
        gender=s5.nextLine();
        System.out.println("Enter date joined : ");
        date_admitted=s5.nextLine();
        System.out.println("Enter total days in hospital : ");
        numofDays=s5.nextLine();
    }
    
}
class Faizan{
    public static void main(String[] args) {
        Patient p1=new Patient(); 
    }
}