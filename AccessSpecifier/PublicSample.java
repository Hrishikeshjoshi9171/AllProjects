package AccessSpecifier;

public class PublicSample {
	public int Rollno=10;

	public static void main(String[] args) {
		PublicSample Ps=new PublicSample();
		Ps.name();
		Ps.m1();
		System.out.println("Public variables:"+Ps.Rollno);

	}
	public void name() {
		System.out.println("Public method:m1");
	}
	public void m1() {
		System.out.println("Public method:m2");
	}

}
