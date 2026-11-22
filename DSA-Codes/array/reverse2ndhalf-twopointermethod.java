import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5};
		int len=arr.length;
		int mid=len/2;
		int left=mid;
		int right=len-1;
	
		while(left<right){

			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;

			left++;
			right--;
		}	
		System.out.println(Arrays.toString(arr));
	}
}