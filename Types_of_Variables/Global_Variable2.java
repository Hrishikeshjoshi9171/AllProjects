package Types_of_Variables;

public class Global_Variable2 {
	static int i=30;

	public static void main(String[] args) {
		System.out.println(i);
		
		Global_Variable2 GV=new Global_Variable2();
		GV.m1();
		GV.m2();
		GV.m3();

	}
	public void m1() {
		i=40;
		System.out.println(i);
	}
	public void m2() {
		System.out.println(i);
	}
	public void m3() {
		 i=50;
		 System.out.println(i);
	}

}
