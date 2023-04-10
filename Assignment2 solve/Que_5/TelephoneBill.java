import java.util.Scanner;
class TelephoneBill{

    String name;
    long phonenum;
    int calls ;
    double duration;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(long phonenum) {
        this.phonenum = phonenum;
    }

    public void setCalls(int calls) {
        this.calls = calls;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getName() {
        return this. name;
    }

    public long getPhoneNo() {
        return this.phonenum;
    }

    public double getDuration() {
        return this.duration;
    }

    public int getCalls() {
        return this.calls;
    }

    public void Bill(){
        int calls = this.calls;
        double amount =0;
        if (calls <100){
        amount = 0.5*calls;
        }
        else {
            int remainingCalls= calls - 100;
            amount= 50+(0.25*remainingCalls);
        }
        
        this.duration = Math.ceil(this.duration); 
        if (this.duration < 1) {
            this.duration = 1;
        }
        double callCost = this.duration * 0.15; 
        amount += callCost;
        

        System.out.println("Name of Customer: " + this.name);
        System.out.println("Phone number: " + this.phonenum);
        System.out.println("Number of calls: " + this.calls);
        System.out.println("Duration of calls: " + this.duration);
        System.out.println("Monthly flat rate: $10");
        System.out.println("Call charges: $" + callCost);
        System.out.println("Total bill amount: $" + (amount + 10));


    }
}

class InputData{
    TelephoneBill tb = new TelephoneBill();

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        tb.setName(sc.nextLine());
        System.out.println("Phone number: ");
        tb.setPhoneNo(sc.nextLong());
        System.out.println("Number of calls: ");
        tb.setCalls(sc.nextInt());
        System.out.println("Duration of calls (in minutes): ");
        tb.setDuration(sc.nextDouble());
    }

    public void printRecord(){
        tb.Bill();
    }
}

class Program{
    public static void main(String[] args) {
   InputData In = new InputData();
   In.acceptRecord();
   In.printRecord();
        
    }
}