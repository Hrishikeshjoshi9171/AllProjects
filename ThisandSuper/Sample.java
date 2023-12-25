package ThisandSuper;

public class Sample {
	int rollno=20;
	int rollno1=30; //Global Non-Static Variable
	
	public static void main(String[] args) {
		/*What is the use of this keyword?
		Answer-->>This keyword is used to access global variable from same class		
		*/
		
		Sample s=new Sample();
		s.test();
		
	}
	public void test() {
		int rollno=40;
		int rollno1=50; //Non-Static local Variable
		
		System.out.println(rollno);
		System.out.println(rollno1);
		System.out.println(this.rollno);
		System.out.println(this.rollno1);
	}

}
