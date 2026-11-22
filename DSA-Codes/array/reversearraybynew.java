import java.util.*;
class Demo{
	
	public static void main(String[]args){

		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
		int len=arr.length;
		int mid=(len-1)/2;
		int arr1[]=new int[len];

		for(int i=0;i<len;i++){

			arr1[len-i-1]=arr[i];
		}
		System.out.println(Arrays.toString(arr1));
	}
}