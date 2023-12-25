package Types_of_Variables;

public class Local_Variable {

	public static void main(String[] args) {
		m1(); //Direct Calling
		m2();
		Local_Variable.m1(); //Calling by classname and methodname
		Local_Variable.m2();

	}
	public static void m1() {
		int a=10;// Local variable--> A variable declared inside the body of the method is called as local variable.
		System.out.println(a); //You can use this variable only within that method body.
	}
	public static void m2() {
		int b=20;
		System.out.println(b);
	}

}
