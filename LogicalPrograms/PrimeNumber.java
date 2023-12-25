package LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//Prime Number--> PM is the number which is greater than 1 and is divisible by 1 or itself.
		
		//Example-->2,3,5,7,11,13
		
		System.out.println("Enter a Number");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i;
		
		for(i=2;i<num;i++) //7
			if(num%i==0) //7%2==0
				break;
		if(i==num) //2==7
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}

}
