package AccessSpecifier;

public class ProtectedSample {

	public static void main(String[] args) {
		ProtectedSample PS=new ProtectedSample();
		PS.m1();
		PS.m2();

	}
	protected void m1() {
		System.out.println("Protected method: 1");
	}
	protected void m2() {
		System.out.println("Protected method: 2");
	}

}
