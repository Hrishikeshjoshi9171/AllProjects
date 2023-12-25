package LogicalPrograms;

import java.util.Scanner;

public class AcceptUserInput {

	public static void main(String[] args) {
		 //Create object of scanner class and pass input system.in		
		Scanner sc =new Scanner(System.in); //System.in is a standard input stream
		
		System.out.println("Enter First Number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b=sc.nextInt();
		
		System.out.println("Addition of two number is =="+(a+b));
	}

}
