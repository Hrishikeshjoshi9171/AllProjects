package String;

public class String3 {

	public static void main(String[] args) {
		// Difference between '==' operator and '.equal' method
		
		String s1=new String("Java");
		String s2=new String("Java");
		
		System.out.println(s1==s2);  //---->False
		System.out.println(s1.equals(s2)); //---->True
		
		String s5="Java";
		String s6="Java";
		
		System.out.println(s5==s6); //---->True
		System.out.println(s5.equals(s6)); //---->False
		
		/*'==' always compare reference comparison/address comparison.
		reference comparison means if we get both the reference point into the same
		object then it will give true.*/
		
		/*'(.equal)'= Content Comparison means compares the two given strings based on
		the content of the String.
		If any character is not matched, it returns false. If all characters are
		matched, it returns true.*/

	}

}
