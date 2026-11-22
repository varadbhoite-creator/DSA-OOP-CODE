import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5,6,7,8,9};
		int len=arr.length;
		int arr1[]=new int[len];
		int j=0;
		for(int i=len-1;i>=0;i--){

			arr1[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(arr1));
	}	
}