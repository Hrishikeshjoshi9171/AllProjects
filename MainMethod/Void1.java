package MainMethod;

public class Void1 {

	public static void main(String[] args) {
		int num=addition (20,40);
		System.out.println(num);
	}
	public static int addition (int a, int b) {
		int sum=a+b;
		System.out.println(sum);
		
		return sum;
/*   If you want a method to return a value, you can add a primitive data type such as 
	 int, char, etc instead of void and use return keyword inside the method. */
	}
	public static void m1() {
		System.out.println(addition(10,30));
	}

}
