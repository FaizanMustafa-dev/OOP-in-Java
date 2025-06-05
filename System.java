



import java.util.Scanner;
import java.util.jar.Attributes.Name;

class Animal{
    protected String name;
    protected int age;
    Animal(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter name of Animal : ");
        name=s1.nextLine();
       System.out.println("Enter age of Animal : ");
       age=s1.nextInt();
    }
    public void output(){
        System.out.println("The name of Animal is "+name);
        System.out.println("The age of Animal is : "+age);
    }
}
class Mammal extends Animal{
    private String furcolour;
    private int count_birth;

Mammal(){
    super();
  
    System.out.println("Enter the fur colour :");
    Scanner s2=new Scanner(System.in);
    furcolour=s2.nextLine();
    System.out.println("Mammal of Animal type added in zoo!");
}
    public void giveBirthToYoung(){

        System.out.println("The Mammel "+name+" is giving birth to young.");
        count_birth++;
    }
    public void display(){
        super.output();
        System.out.println("The mammal has produced "+count_birth+" young child!");
    }

}
class Bird extends Animal{
    private double wingspan;
    private boolean canfly=false;
    Bird(){
        super();
Scanner s3=new Scanner(System.in);
System.out.println("Enter the wing span of Bird : ");
wingspan=s3.nextDouble();

System.out.println("Bird can fly or not ,Enter true for fly and enter false for can't fly : ");
canfly=s3.nextBoolean();
System.out.println("Bird of Animal type added in zoo!");
    }

    public void fly(){
        if(canfly){
    System.out.println(name+" is flying : ");
   }
   else if(!canfly){
System.out.println("The bird can't fly because its not a flying bird!");
   }
        
    }
 public void print(){
    super.output();
    System.out.println("The wing span of "+name+" is : "+wingspan);
   if(canfly){
    System.out.println(name+" can fly.");
   }
   else if(!canfly){
System.out.println("The bird can't fly!");
   }
 }
}
class Programing{

    public static void main(String[] args) {
    System.out.println("For Mammal : ");
    Mammal M1=new Mammal();
    System.out.println("For Bird : ");
      Bird B1=new Bird();
    int choice;

    Scanner s6 = new Scanner(System.in);
  System.out.println("Zoo Management System");
    while (true) {
      
        System.out.println();
        System.out.println("1-Show Animal info.");
        System.out.println("2-Fly bird ");
        System.out.println("3-Birth for Mammel");
        System.out.println("Enter -1 for exit.");
        System.out.println("Enter your choice: ");
        choice = s6.nextInt();

        if (choice == -1) {
            break; 
        }

        switch (choice) {
            case 1: {
            int choices;
            System.out.println("Enter 1 for Mammal and enter 2 for Bird : ");
            choices=s6.nextInt();
            if(choices==1){
                M1.display();
            }
            else if(choices==2){
                B1.print();
            }
            else{
                System.out.println("You enter wrong choice!");
            }
                break;
            }
            case 2: {
               B1.fly();
                break;
            }
            case 3:{
                M1.giveBirthToYoung();
                break;
            }
            default: {
                System.out.println("You entered the wrong choice!");
            }
        }

}
}
}
