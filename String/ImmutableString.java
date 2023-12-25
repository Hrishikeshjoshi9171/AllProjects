package String;

public class ImmutableString {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		
		/*Once we create an object, after that java does not allow to perform changes.
		 But if you are trying to perform any changes with those changes, new objects
		 will be created.*/
		
		s2="Python";
		String s3="Ruby";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//2.Security
		//3.Code optimization and performance

	}

}
