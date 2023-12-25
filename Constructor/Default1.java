package Constructor;

public class Default1 {
	//Default Constructor

	public static void main(String[] args) {
		//Create object of same class
		Default1 D= new Default1();
		D.multiplication(); //Call method
		
		//Create object of different class
		DefaultConstructor DC=new DefaultConstructor();
		DC.addition();

	}
	public void multiplication() {
		int a=10;
		int b=20;
		int mul=a*b;
		System.out.println(mul);
	}

}
