package Loops;

public class While_Loop3 {
	// Addition of even numbers from 1 to 20

	public static void main(String[] args) {
		int sum = 0; // Start condition
		int i = 0;
		while (i <= 20) { // End condition
			sum = sum + i;
			i = i + 2;

		}
		System.out.println("Addition of even numbers from 1 to 20 is : " + sum);

	}

}
