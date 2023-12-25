package AccessSpecifier;

public class PrivateSample {
	private int number=30;

	public static void main(String[] args) {
		PrivateSample PR=new PrivateSample();
		PR.m1();
		PR.m2();
		System.out.println("Private variable:"+PR.number);

	}
	private void m1() {
		System.out.println("Private method:m1");
	}
	private void m2() {
		System.out.println("Private method:m2");
	}

}
