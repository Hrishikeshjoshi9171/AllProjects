package Abstraction;

public class HDFCBank extends RBIBank{

	public static void main(String[] args) {
		HDFCBank HB=new HDFCBank();
		HB.Credit();
		HB.Debit();
		HB.loan();
		HB.funds();

	}
	public void loan() {
		System.out.println("HDFC-->Loan Method");
	}
	public void funds() {
		System.out.println("HDFC-->Funds");
	}

}
