package Array;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		//input-->1,2,2,1,1,1,2,2,1,2,1,2
		//Output-->1,1,1,1,1,1,2,2,2,2,2,2
        
		int arr1[]= {1,2,2,1,1,1,2,2,1,2,1,2}; //Array Declaration & Initialization
		Arrays.sort(arr1);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
