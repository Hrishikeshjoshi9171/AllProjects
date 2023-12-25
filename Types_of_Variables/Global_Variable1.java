package Types_of_Variables;

public class Global_Variable1 {
	//Static global Variables call from same class 
			static int i=40;
			static String name="Akash";

	public static void main(String[] args) {
		
		System.out.println(name);
		System.out.println(i);
		m2();
		m1();
		
		System.out.println();
		
		Global_Variable1 GV =new Global_Variable1();
		GV.m3();

	}
	public static void m2() {
		System.out.println(i);
		System.out.println(name);
		System.out.println();
	}
	public static void m1() {
		//Local Variable		
		System.out.println(i);
		System.out.println(name);
		System.out.println();
		
	}
	public void m3() {
		System.out.println(i);
		System.out.println(name);
	}

}
