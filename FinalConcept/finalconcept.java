package FinalConcept;

public final class finalconcept {

	public static void main(String[] args) {
		/* final--> Final is the keyword and access modifier which is used as restrictions on
		a variable, class and methods.
		Final Class cannot be inherited to child class.
		Final Method means cannot be overridden by subclass.
		Once we declare as a final variable, it cannot be modified. */
		
		int i=100;
		System.out.println(i);
		i=200;
		System.out.println(i);
		
		final int j=300;
		System.out.println(j);
		//j=400;
	}
	public void finalmethod() {
		System.out.println("Final Method");
	}

}
