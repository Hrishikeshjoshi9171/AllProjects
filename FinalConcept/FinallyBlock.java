package FinalConcept;

public class FinallyBlock {

	public static void main(String[] args) {
		/*Finally--> Finally is a block in java exception handling to execute 
		the important code whether the execution occurs or not. */
		test();
		div();
	}
	public static void test() {
		try {
			System.out.println("Test Method");
		}
		catch(Exception e) {
			System.out.println("Catch Block");
		}
		finally {
			System.out.println("Finally Block");
		}
	}
	public static void div() {
		int i=10;
		
		try {
			System.out.println("Div test method");
			int k=i/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Inside Catch Block");
			System.out.println("Divided by Zero Error");
		}
		finally {
			System.out.println("Executed this code even after any execution");
		}
	}

}
