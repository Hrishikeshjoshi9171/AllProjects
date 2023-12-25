package Constructor;

public class Sample2 {
	//With parameter constructor
	//1]Variable Declaration
	int num;
	int num1;
	String name;
	public Sample2() {//Without parameter constructor //Variable Initialization
		num=10;
		num1=20;
	}
	public Sample2(int a, int b) {//2 Parameter constructor
		num=a;
		num1=b;
		int addition1=a+b;
		System.out.println(addition1);
	}
	public void addition() {
		int sum=num+num1;
		System.out.println(sum);
	}
	public void addition1(int a,int b) {
		num=a;
		num1=b;
		int addition1=a+b;
		System.out.println(addition1);
	}

	public static void main(String[] args) {
		Sample2 s2=new Sample2();
		s2.addition();
		
		Sample2 s3=new Sample2(10,20);
		s3.addition1(12,33);
		System.out.println(s3.num+" "+s3.num1);

	}

}
