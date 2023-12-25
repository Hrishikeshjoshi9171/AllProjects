package Constructor;

public class Sample1 {
	//Without parameter constructor
	//Step-1-->Variable Declaration
	int i;
	int j;
	
	//Step-2-->Variable Initialization
	public Sample1() {
		i=100;
		j=20;
	}
	public void addition() {
		int sum=i+j;
		System.out.println(sum);
	}
	public void mul() {
		int mul=i*j;
		System.out.println(mul);
	}
	public void division() {
		int div=i/j;
		System.out.println(div);
	}

	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		s1.addition();
		s1.mul();
		s1.division();

	}

}
