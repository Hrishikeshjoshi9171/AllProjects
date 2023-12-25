package Loops;

public class While_Loop1 {
	// Addition of numbers from 1 to 5

	public static void main(String[] args) {

		int sum = 0; // Start condition
		int i = 1;
		while (i <= 5) {

			sum = sum + i;
			i++; // End condition

		}
		System.out.println("Addition of 5 numbers is :" + sum);

	}

}
