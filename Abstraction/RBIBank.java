package Abstraction;

public abstract class RBIBank {

	public static void main(String[] args) {
		//Abstract Method:- No Method Body

	}
	public abstract void loan();
	
	public void Credit() {
		System.out.println("Bank-->Credit");
	}
	public void Debit() {
		System.out.println("Bank-->Debit");
	}

}
