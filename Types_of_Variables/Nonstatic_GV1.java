package Types_of_Variables;

public class Nonstatic_GV1 {
	String name="Rahul"; //Non Static global variable

	public static void main(String[] args) {
		Nonstatic_GV1 N=new Nonstatic_GV1();
		System.out.println(N.name);
		N.m1();
		
		System.out.println();
		NonStatic_Differentclass DC=new NonStatic_Differentclass();
		System.out.println(DC.Rollno);
		DC.m2();

	}
	public void m1() {
		Nonstatic_GV1 N1=new Nonstatic_GV1();
		System.out.println(N1.name);
	}

}
