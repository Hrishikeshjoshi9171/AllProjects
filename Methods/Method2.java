package Methods;

public class Method2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		//1.Direct calling by method name
		staticmethod();
		staticmethod1();
		
		//2.Calling by Class name
		//Syntax-->>classname.methodname();
		Method2.staticmethod();
		Method2.staticmethod1();
		
		System.out.println("Main Method Ended");

	}
	public static void staticmethod () {
		System.out.println("Static method calling from same class :staticmethod");
	}
	public static void staticmethod1 () {
		System.out.println("Static method calling from same class :staticmethod1");
	}

}
