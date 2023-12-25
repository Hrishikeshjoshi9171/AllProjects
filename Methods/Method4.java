package Methods;

public class Method4 {
	//Different class/Another class
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		//1. Calling by class name
		//syntax --> Classname.methodname();
		Method3.m3();
		Method3.m4();

		System.out.println("Main method ended");
		System.out.println();
		
		Method2.staticmethod();
		Method2.staticmethod1();
		m5();
		
	}
	public static void m5() {
		System.out.println();
		System.out.println("Hello good morning");		
	}
}
