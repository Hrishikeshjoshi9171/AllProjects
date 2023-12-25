package Methods;

public class Method8 {

	public static void main(String[] args) {
		addition();
		addition();
		addition(56,23);
		addition(30, 50);
		substraction(46,23,12);
		Studentname("Hrishikesh");

	}

	// Method without parameter
	public static void addition() {

		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("Sum of two numbers is :" + sum);

	}

	// Method with 2 parameter
	public static void addition(int x, int y) {

		int z = x + y;
		System.out.println("Addition of two numbers is : " + z);

	}
	//Method with three input parameters
	public static void substraction(int a, int b, int c) {
		int substraction=a+b-c;
		System.out.println("Addition & Substraction of three numbers is :"+substraction);
	}
	//Method with String input parameter
	public static void Studentname(String name) {
		System.out.println("Student name is :"+ name);
	}

}
