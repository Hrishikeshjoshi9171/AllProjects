package Interface;

public class TestClass {

	public static void main(String[] args) {
		AdvanceCalculator ac=new AdvanceCalculator();
		ac.addition();
		ac.Substraction();
		ac.Multiplication();
		System.out.println();
		
		System.out.println(Calculator.x);		
		System.out.println();
		
		
		ac.cos();
		ac.log();
		ac.sin();
		ac.Tan();
		System.out.println();
		
		Calculator C=new AdvanceCalculator(); //Top Casting
		C.addition();
		C.Substraction();
		C.Multiplication();
		System.out.println();
		
		System.out.println(RBIBank.minbalance);
		System.out.println();
		
		HSBCBank HB=new HSBCBank();
		HB.credit();
		HB.Debit();
		HB.Transfermoney();
		System.out.println();
		
		HB.Bikeloan();
		HB.PersonalLoan();
		System.out.println();
		
		HB.MutualFund();
		HB.HomeLoan();
		
		RBIBank RB=new HSBCBank();
		RB.credit();
		RB.Debit();
		RB.Transfermoney();
		
		BrazilBank BB=new HSBCBank();
		BB.MutualFund();

	}

}
