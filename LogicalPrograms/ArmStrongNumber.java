package LogicalPrograms;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		//153=1+125+27=153
		//123=1+8+27=36
		int p,sum,rem;
		
		System.out.println("Enter a number");
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		p=num;
		
		for(sum=0;num>0;num=num/10) {
			
			rem=num%10;
			
			sum=sum+rem*rem*rem;
		}
		if(sum==p)
			System.out.println("ArmStrong Number");
		else
			System.out.println("Not ArmStrong Number");
	}

}
