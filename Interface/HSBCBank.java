package Interface;

public class HSBCBank implements RBIBank, USBank, BrazilBank{

	public static void main(String[] args) {
		System.out.println(minbalance);

	}

	@Override
	public void MutualFund() {
		System.out.println("BrazilBank-->Mutual Fund");
		
	}

	@Override
	public void Bikeloan() {
		System.out.println("USBank-->Bike Loan");
		
	}

	@Override
	public void PersonalLoan() {
		System.out.println("USBank-->Personal Loan");
		
	}

	@Override
	public void credit() {
		System.out.println("HSBCBank-->Credit");		
	}

	@Override
	public void Debit() {
		System.out.println("HSBCBank-->Debit");		
	}

	@Override
	public void Transfermoney() {
		System.out.println("HSBCBank-->Transfer Money");
	}
	public void HomeLoan() {
		System.out.println("HSBCBank-->Home Loan");
	}

}
