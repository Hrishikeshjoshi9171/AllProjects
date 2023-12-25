package String;

public class StringDemo {

	public static void main(String[] args) {
		String s1=new String("Java");
		String s2=new String("Java");
		String s3="Java";
		String s4="Java";
		
		s1.concat("Python");
		System.out.println(s1);

		s1=s1.concat("C++");
		System.out.println(s1);
		
		s4=s4.concat("Python");
		System.out.println(s4);
		
		s3.concat(".NET");
		System.out.println(s3);
		
		s2=s2.concat(".NET");
		System.out.println(s2);

	}

}
