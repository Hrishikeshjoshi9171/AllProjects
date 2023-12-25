package String;

public class String1 {

	public static void main(String[] args) {
		//Memory Allocation
		String s=new String("Java");
		String s1="Java";
		String s2="Java";
		String s3=s1;
		
		String n1=new String("Java");
		String n2=new String("Java");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
	}

}
