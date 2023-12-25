package Array;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {1,9,6,8,10};
		System.out.println("Original Array");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Reverse Array");
		
		for(int j=4;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}

	}
}
