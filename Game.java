import java.util.Scanner;
class Account{
   private String accountHolderName;
   private int accountNumber;
   protected double balance=0;
   Account(){
   Scanner s1=new Scanner(System.in);
    System.out.println("Enter Account Holder Name : ");
    accountHolderName=s1.nextLine();
      System.out.println("Enter Account number : ");
    accountNumber=s1.nextInt();
      System.out.println("Enter Balance to add in your created account  : ");
    balance=s1.nextDouble();
   }
   Account(String name,int acc_num,double Balance){
     accountHolderName=name;
     accountNumber=acc_num;
     balance=balance+Balance;
   }
   public void display(){
    System.out.println("Account Holder Name : "+accountHolderName);
    System.out.println("Account number : "+accountNumber);
    System.out.println("Balance of Account : "+balance);   } }
class SavingsAccount extends Account{
private double interestRate=0.05;
SavingsAccount(){
    super();
System.out.println("The Interest rate of Saving accounts is: "+interestRate);
balance=balance+((interestRate)*balance);}
public void deposit(){
    Scanner s3=new Scanner(System.in);
    System.out.println("Enter amount to add : ");
    this.balance+=s3.nextDouble();
     System.out.println("Amount succesfully deposited!");
}
public void print_info(){
    super.display();
}
}
class  CurrentAccount extends Account{
    private double overDraftLimit;
CurrentAccount(){
 super();
}
public void withdraw_Currentacc(){
    Scanner s4=new Scanner(System.in);
    System.out.println("Enter Amount to withdraw : ");
    overDraftLimit=s4.nextDouble();
    if(overDraftLimit>0 && overDraftLimit<=balance){
        balance-=overDraftLimit;
        System.out.println(overDraftLimit+" successfuly withdrawal! ");  }
    else{
        System.out.println("Insuficient balance!");
    }
}
public void show_info(){
        super.display();   
    }
    public void deposit_Currentacc(){
        Scanner s5=new Scanner(System.in);
        System.out.println("Enter amount to deposite : ");
        balance=balance+s5.nextDouble();
        System.out.println("Amount succesfully deposited!");
    }
}
class Game{
 public static void main(String[] args) {
    System.out.println("For k Svaing Account : ");
   SavingsAccount S1 = new SavingsAccount();
    System.out.println("For Current Account : ");
        CurrentAccount C1 = new CurrentAccount();
        int choice;
        Scanner s6 = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1-Show Account info.");
            System.out.println("2-Deposit Amount.");
            System.out.println("3-Withdraw Amount (Only for Current Account).");
            System.out.println("Enter -1 for exit.");
            System.out.println("Enter your choice: ");
            choice = s6.nextInt();
            if (choice == -1) {
                break; 
            }
            switch (choice) {
                case 1: {
                    int choices;
                    System.out.println("Enter 1 for Saving account and Enter 2 for Current Account: ");
                    choices = s6.nextInt();
                    if (choices == 1) {
                        S1.print_info();
                    } else if (choices == 2) {
                        C1.show_info();
                    }
                    break;
                }
                case 2: {
                    int Choices;
                    System.out.println("Enter 1 for Saving account and Enter 2 for Current Account: ");
                    Choices = s6.nextInt();
                    if (Choices == 1) {
                        S1.deposit();
                    } else if (Choices == 2) {
                        C1.deposit_Currentacc();
                    } else {
                        System.out.println("You entered the wrong choice!");
                    }
                    break;
                }
                case 3: {
                    C1.withdraw_Currentacc();
                    break;
                }
                default: {
                    System.out.println("You entered the wrong choice!");                }          } }
        System.out.println("Exit Successfully!");
        s6.close();
}
}
