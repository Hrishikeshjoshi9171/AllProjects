package ExceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("Program is Started");
		
		int a=20;
		try {
			System.out.println(a/0); //This code will throw an Exception
		}
		catch(ArithmeticException e) { //Here we have to tell what kind of Exception it will throw 
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("This /by ero erro");
		}
		//If you don't know the exception name use //genericException
		
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
