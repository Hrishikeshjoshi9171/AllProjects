package LogicalPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		//Example=6*5*4*3*2*1==720
		int num=6;
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of number is:"+factorial);
	}

}
