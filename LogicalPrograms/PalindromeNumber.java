package LogicalPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int Originalnumber,i,sum,rem;
		
		System.out.println("Enter a Number");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		Originalnumber=num;
		
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
			sum=sum*10+rem;
		}
		if(sum==Originalnumber)
			System.out.println(Originalnumber+":is a Palindrome Number");
		else
			System.out.println(Originalnumber+":is not a Palindrome Number");
	}

}
