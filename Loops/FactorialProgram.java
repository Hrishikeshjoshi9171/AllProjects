package Loops;

public class FactorialProgram {

	public static void main(String[] args) {
		int fact =1;
		int number=4;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+ number + " is : "+ fact);

	}

}
