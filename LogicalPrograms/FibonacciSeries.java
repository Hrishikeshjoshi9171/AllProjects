package LogicalPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
//		In Fibonacci series next number is the sum of previous two numbers
//		Example-->0,1,1,2,3,5,8,13,21,34,55
		
		int a=-1,b=1,c;
		for(int i=1;i<=11;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
