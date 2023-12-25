package LogicalPrograms;

public class SwappingTwoNumberWithoutThirdvalue {

	public static void main(String[] args) {
//		int a=10,b=20;
//		System.out.println("Before Swapping values:"+a+" "+b);
//		
//		a=a+b; //10+20=30
//		b=a-b; //20-10=10
//		a=a-b; //30-10=20
//		System.out.println("After Swapping values:"+a+" "+b);
		
		String a= "First";
		String b= "Second";
		System.out.println(a.replaceAll(a, b));
		System.out.println(b.replaceAll(b, a));
		
	}

}
