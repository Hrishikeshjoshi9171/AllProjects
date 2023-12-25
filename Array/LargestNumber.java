package Array;

public class LargestNumber {

	public static void main(String[] args) {
		int arr[]= {2,4,533,77,88,9,11};
		int maximum=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maximum) {
				maximum=arr[i];
			}
		}
		System.out.println("Largest Number present in given array is:"+maximum);
	}

}
