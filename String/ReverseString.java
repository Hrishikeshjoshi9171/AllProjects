package String;

public class ReverseString {

	public static void main(String[] args) {
		//WAP to reverse a String without using the reverse method
		
		String s21="Automation";
		int len=s21.length();
		String rev="";
		for(int j=len-1;j>=0;j--) {
			rev=rev+s21.charAt(j);
		}
		System.out.println(rev);
		}

}
