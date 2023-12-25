package Constructor;

public class NeedofConstructor {
	String name; //--> Null
	int Rollno; //--> 0
	public NeedofConstructor() {
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		NeedofConstructor s1=new NeedofConstructor(); //null,0
		NeedofConstructor s2=new NeedofConstructor(); //null,0
		s1.m1();
		s2.m2();

	}
	public void m1() {
		System.out.println(name+" "+Rollno);
	}
	public void m2() {
		System.out.println(name+" "+Rollno);
	}

}
