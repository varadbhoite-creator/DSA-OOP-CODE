import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int len=arr.length;
		int mid=(len-1)/2;

		for(int i=0;i<mid;i++){

			int temp=arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}