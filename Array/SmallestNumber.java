package Array;

public class SmallestNumber {

	public static void main(String[] args) {
		int arr[]= {2,4,533,77,88,9,11};
		int minimum=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minimum) {
				minimum=arr[i];
			}
		}
		System.out.println("Smallest Number present in given array is:"+minimum);
	}

}
