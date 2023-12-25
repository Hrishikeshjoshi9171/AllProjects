package AccessSpecifier;

public class DefaultAccess {
	int no=10;

	public static void main(String[] args) {
		DefaultAccess DF=new DefaultAccess();
		DF.m1();
		DF.m2();
		System.out.println("Default variable:"+DF.no);

	}
	void m1() {
		System.out.println("Default method:1");
	}
	void m2() {
		System.out.println("Default method:2");
	}

}
