package creditscorecalculator.org;

class CreditScoreCalculator{
	private int credithistory;
	private double creditutilization;
	private boolean paymenthistory;
	
	public CreditScoreCalculator( ) {
		this.credithistory=0;
		this.creditutilization = 0.0;
		this.paymenthistory= false;
	}

	public CreditScoreCalculator(int credithistory, double creditutilization, boolean paymenthistory) {
		this.credithistory = credithistory;
		this.creditutilization = creditutilization;
		this.paymenthistory = paymenthistory;
	}

	public int getCredithistory() {
		return credithistory;
	}

	public void setCredithistory(int credithistory) {
		this.credithistory = credithistory;
	}

	public double getCreditutilization() {
		return creditutilization;
	}

	public void setCreditutilization(double creditutilization) {
		this.creditutilization = creditutilization;
	}

	public boolean isPaymenthistory() {
		return paymenthistory;
	}

	public void setPaymenthistory(boolean paymenthistory) {
		this.paymenthistory = paymenthistory;
	}
	public int calculateCreditScore() {
		int creditscore;
		if (paymenthistory) {
			
			 creditscore  = (this.credithistory * 15) + (int)(this.creditutilization * 30) + 55;
		}
		else {
			creditscore = (credithistory * 15) + (int) (creditutilization * 30) + 35;
			
		}
		return creditscore;
	}
	
}

public class Program {
	public static void main(String[] args) {
		CreditScoreCalculator calculator = new CreditScoreCalculator(6, 0.5,true);
		 int creditscoreis =calculator.calculateCreditScore();
		 System.out.println(creditscoreis);
		 
		
		
	}

}
