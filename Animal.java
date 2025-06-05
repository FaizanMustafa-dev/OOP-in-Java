import java.util.ArrayList;
import java.util.Scanner;
class Bank{
    private String name;
    private int interestRate;
    
   public void getvalue(){
Scanner s1=new Scanner(System.in);
System.out.println("Enter name : ");
String n=s1.nextLine();
System.out.println("Enter intererst rate : ");
int i=s1.nextInt();
setvalues(n,i);
    }
   public void setvalues(String n,int i){
name=n;
interestRate=i;
    }
    public void display(){
        System.out.println("Bank Name is : "+this.name);
System.out.println("Interest rate : "+interestRate+"%");
    }

}
class AliedBank extends Bank{
    @Override
    public void getvalue() {
        // TODO Auto-generated method stub
        super.getvalue();
    }

 @Override
 public void display() {
     
     super.display();
 }
}
class HBL extends Bank{
    @Override
    public void getvalue() {
     
        super.getvalue();
    }
@Override
public void display(){
    super.display();
}
}
class MCB extends Bank{
    @Override
    public void getvalue() {
        
        super.getvalue();
    }
    @Override
    public void display() {
    
        super.display();
    }
}
public class Animal {

    public static void main(String[] args){

        ArrayList<Bank>list=new ArrayList<>();
        
        System.out.println(list.size());
       
       
try{
    int a=10;
    int b=a/0;
}
catch(ArithmeticException e){


}
        
    }
}