package StarPatternProgram;

public class Reverse_Left_Triangle {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//Row
			for(int j=1;j<=5;j++) {
				if(j>=i) {
					System.out.print("*");
				}
				else {
					System.out.print("");
				}
			}
			System.out.println();
		}

	}

}
