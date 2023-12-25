package Types_of_Variables;

public class Local_Variable1 {

	public static void main(String[] args) {
		int i=10;
		String s="Virat";
		System.out.println(i);
		System.out.println(s);
		Local_Variable1 LV= new Local_Variable1();
		LV.m2();

	}
	public static void m1() {
		int i=20; // local variable
		System.out.println(i);
	}
	public void m2() {
		int j=20;
		int k=30;
		int x=j+k;
		System.out.println(x);
		String s2="Rohit";
		System.out.println(j);
		System.out.println(s2);
		
	}

}
