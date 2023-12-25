package LogicalPrograms;

import java.util.Scanner;

public class Fibonacci_UserInput {

	public static void main(String[] args) {
		int i,a=-1,b=1,c;
		System.out.println("Enter Number");
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
