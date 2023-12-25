package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	//Global Logic

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int A[]=new int[N];
		//input N and Array
		for(int i=0;i<N;i++)
			A[i]=in.nextInt();
		//Create another array that will be stored
		int [] copyA=Arrays.copyOf(A, N);
		//sort the array(arrange h height wise)
		Arrays.sort(copyA);
		for(int i=0;i<N;i++) {
			//check for wrong position and print their indices
			if(A[i]!=copyA[i])
				System.out.println(i+" ");
		}
	}

}
