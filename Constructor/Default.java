package Constructor;

public class Default {
	String name;
	int Rollno;
	public Default() {
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		Default D=new Default();
		Default D1=new Default();
		Default D2=new Default();
		//       :
		//       :
		Default D10=new Default();
		D10.m1();
		D.m1();
		D1.m1();
		D2.m1();

	}
	public void m1() {
		System.out.println("Default method");
	}

}
