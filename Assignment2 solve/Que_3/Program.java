import java.util.Scanner;

public class TelephoneBill {
         String customerName;
         double mobno;
         int numCalls;
         int duration;
          
         double calculateBill( double numCalls) {
        	
        	 if(numCalls<100) {
        		 
        	double Bill =35.45*numCalls;
        		 System.out.println("Bill is : "+Bill);
        	return Bill;
         }
        	
		
         }
}
   class Program{
	public static void main(String[] args) {
		TelephoneBill t=new TelephoneBill();
            Scanner sc=new Scanner(System.in);
            System.out.println("Type name :");
          String  customerName=sc.next();
          System.out.println("Type your mobile number");
          double mobno=sc.nextDouble();
          System.out.println("Number of calls :");
          int numCalls=sc.nextInt();
          System.out.println("Total Duration ");
          int duration=sc.nextInt();
         double Result= t.calculateBill(10.00);
          //
    //  System.out.println("Name :"+customerName+" Mobile number :"+mobno+"  Number of calls :"+numCalls+"  total duration :"+duration+"  Result :"+Result);
	System.out.println(Result);
}

}