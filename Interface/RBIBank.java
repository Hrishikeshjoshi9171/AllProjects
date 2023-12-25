package Interface;

public interface RBIBank {
	int minbalance=1000; //Static & final
	
	public void credit(); //Abstract method
	
	public void Debit();
	
	public void Transfermoney();

}
