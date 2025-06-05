import java.util.Scanner;
class Book{
   public String title;
   public String aurthur_name;
    void get_values(){
Scanner s1=new Scanner(System.in);
System.out.println("Enter the title of book : ");
title=s1.nextLine();
System.out.println("Enter aurthur name : ");
aurthur_name=s1.nextLine();
    }
    public void Display(){
        System.out.println("The Title of Book is : "+title);
        System.out.println("The Aurthur of Book is : "+aurthur_name);
    }
   

}

class BookDetail extends Book{
String price;
static int stock=5;
@Override
void get_values(){
    super.get_values();
Scanner s2=new Scanner(System.in);
System.out.println("Enter the price of book : ");
price=s2.nextLine();
}
public  void sell(){
    System.out.println("The book '"+title+"' is selling!");
    stock--;
}
public void stockcheck(){
    System.out.println("The current stock of this book is : "+stook);
}
public boolean checkname(String name){
        if(this.aurthur_name.equals(name)){
            return true;
        }
        return false;
        
    }
    public boolean checktitle(String name){
        if(this.title.equals(name)){
            return true;
        }
        return false;

        
    }
    public void Display(){
        super.Display();
        System.out.println("The price of Book is : "+price);
    }



}
class Untitled{

    public static void main(String[] args) {
        boolean flag=false;
        boolean flag1=false;
        int choice=1;
        System.out.println("Enter how many books you want to create : ");
        Scanner s3=new Scanner(System.in);
        int size=s3.nextInt();
BookDetail[] book=new BookDetail[size];

System.out.println("Enter book detail : ");
     for(int i=0;i<size;i++){
    
        System.out.println("Enter for book "+(i+1)+" : ");
        book[i]=new BookDetail();
        book[i].get_values();
     }
    

  System.out.println("1-Sell a book");
  System.out.println("2-Chech by Aurthur Name");
  System.out.println("3-Check by Title of book");
  System.out.println("4-Display Books");
  System.out.println("Enter -1 to exit");
  
  while(choice!=-1){
System.out.println("Enter your choice : ");
  choice=s3.nextInt();
    switch (choice) {

        case 1:{
            book[size-1].sell();
   size--;
            break;
        }
        case 2:{
     System.out.println("Enter the name to search : ");
        s3.nextLine();
        String Name=s3.nextLine();
for(int i=0;i<size;i++){
if(book[i].checkname(Name)==true){
    System.out.println("Book found ");
    flag=true;
    break;
}
}
if(flag==false){
System.out.println("Book not found!");
}

         break;
        }
        case 3:{
 System.out.println("Enter the Title to search : ");
        s3.nextLine();
        String Name=s3.nextLine();
for(int i=0;i<size;i++){
if(book[i].checktitle(Name)==true){
    System.out.println("Book found ");
    flag1=true;
    break;
}
}
if(!flag1){
System.out.println("Book not found!");
}

            break;
        }
            case 4:{
if(size<=0){
    System.out.println("No Book Available");
}
else{


                for(int i=0;i<size;i++){
                    System.out.println("Book "+(i+1)+" details : ");
                    book[i].Display();
                }
            }
                break;
            }
         
    
        default:{

            System.out.println("You enter wrong choice!");
            break;
        }
            
    }
  }
   
  


} 
 }
    
