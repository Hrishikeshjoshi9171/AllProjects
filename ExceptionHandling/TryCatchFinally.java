package ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		int arr[]=new int[5];
		try {
			arr[14]=100; //ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Hello");
		}
		finally {
			System.out.println("This is finally block");
			
			//1.Exception occur, Catch block handle, Finally block also executed
			//2.Exception occur, Catch block not handle, Finally block executed
			//3.Exception not occur, Catch will ignore exception, finally block executed
		}
	}

}
