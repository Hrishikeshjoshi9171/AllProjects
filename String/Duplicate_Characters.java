package String;

public class Duplicate_Characters {

	public static void main(String[] args) {
		String name="Hrishikesh";
		int count=0;
		char[] input=name.toCharArray();
		System.out.println("Duplicate characters are:");
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(input[i]==input[j]) {
					System.out.println(input[j]);
					count++;
					break;
				}
			}
		}
		
}
}