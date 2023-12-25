package StarPatternProgram;

public class Diamond1 {

	public static void main(String[] args) {
		int k=0,j,i;
		for(i=1;i<=5;i++) {//Row
			if(i<=3)
				k++;
			else
				k--;
			for(j=1;j<=5;j++) {
				if(j>=4-k && j<=2+k) { //3>=1 && 3<=5
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
