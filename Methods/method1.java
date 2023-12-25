 package Methods;

public class method1 { //Class body

	public static void main(String[] args) {// Main Method body
		//Static Regular Method calling from same class
		System.out.println("Main Method Started");
		
		//1.direct calling
		//syntax--methodname();
		m1();
		m2();
		
		//2.Calling by class name
		// syntax -- classname.methodname();
		method1.m1();
		method1.m2();
		
		System.out.println("Main Method Ended");
		
	}
	public static void m1() {
		System.out.println("Static Regular method class from same class :m1" );
	}
	public static void m2() {
		System.out.println("Static Regular method class from same class :m2");
	}

}
