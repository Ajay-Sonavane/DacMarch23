import java.util.Scanner;
 class Bank {
    private String name ;
     private long accnum;
     private  double balance;

     Scanner sc = new Scanner (System.in);

    Bank(){
        this.accnum = 123;
        this.name = "Ajay Sonavane";
        this.balance = 0;
    }



         public void createaccount(){
            
            System.out.println("Enter your name : ");
            String  name = sc.nextLine();
            System.out.println("Enter Uid number : ");
            long uid = sc.nextLong();
            System.out.println("Your account is created");

            System.out.println("---------------");

            
         }
         public void deposit (){
           
            System.out.println("Enter your acconut number :");
            double accnum = sc.nextDouble();
            if (this.accnum== accnum){
            System.out.println("Enter amoutnt to deposit");
            double amount = sc.nextDouble();
            this.balance = this.balance +amount;}


         }

        public void  checkbalance(){
            System.out.println("Enter your acconut number :");
            double accnum = sc.nextDouble();
            if (this.accnum== accnum){

            System.out.println("account balance :"+this.balance);
            }
         }


         public void withdraw(){
           //double d= accountnumber();
           System.out.println("Enter your acconut number :");
           double accnum = sc.nextDouble();
            if (this.accnum==accnum) {
                System.out.println("Enter amount to withdraw");
                 int amount= sc.nextInt();
                if (this.balance >= amount )
                this.balance= this.balance-amount;
                else 
                System.out.println("Insufficient account balance");

            }
            

         }
          public double accountnumber (){
            System.out.println("Enter your acconut number :");
            double accnum = sc.nextDouble();
            return accnum;
         }

         public void  displayInfo(){
                    System.out.println("Enter your account number: ");
                    int amount = sc.nextInt();
                    if (this.accnum==amount){
                        System.out.println("name: "+this.name+" "+"account balance "+this.balance);
                    }
         }

    
}

class BankAcc {
    static int menuList (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1: Create account");
        System.out.println("Enter 2: Deposit money");
        System.out.println("Enter 3: Withdrawn money");
        System.out.println("Enter 4: check account balance");
        System.out.println("Enter 5: account Holder information");
        System.out.println("Enter 0: exit");
        return (sc.nextInt());



    }


}

class Program{
    public static void main(String[] args) {
        Bank bank = new Bank();
int choice;
        Scanner sc = new Scanner (System.in);
        while ((choice =BankAcc.menuList()) != 0)
        {

        switch(choice){
            case 1:  bank.createaccount();
            break;

            case 2:  
            bank.deposit();
            break;

            case 3: 
            bank.withdraw();

            case 4:
            bank.checkbalance();
            break;
            
            case 5: bank.displayInfo();
            break;
        }
        
        }
    
    }
}
