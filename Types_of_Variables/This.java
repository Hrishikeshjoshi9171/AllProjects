package Types_of_Variables;

public class This {
	 String name="Suraj";
	//What is Use of 'this' keyword --> 'This' keyword is used to access global variables from same class.

	public static void main(String[] args) {
		String name="Akash";
		System.out.println(name);
		This t=new This();
		t.m1();

	}
	public void m1() {
		String name="Rahul";
		System.out.println(name);
		System.out.println(this.name);
	}

}
