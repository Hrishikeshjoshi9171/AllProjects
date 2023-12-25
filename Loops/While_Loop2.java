package Loops;

public class While_Loop2 {
	// Addition of odd numbers from 1 to 20

	public static void main(String[] args) {
		int sum = 0; // Starting condition
		int i = 1;
		while (i <= 20) {// End Condition
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("Addition of odd numbers from 1 to 20 is : " + sum);

	}

}
