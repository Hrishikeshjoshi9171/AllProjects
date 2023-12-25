package ExceptionHandling;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		System.out.println("Program is Started");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program is ended");
	}

}
