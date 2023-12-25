package LogicalPrograms;

public class Totalnumberofalphabets {

	public static void main(String[] args) {
		String string= "aaaaabbbbcccdde";
		int count=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);
	}

}
