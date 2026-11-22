import java.util.*;
class Demo{

	public static void main(String[]args){
		int arr[]={1,2,3,4,5,6};
		int len=arr.length;
				
		int temp=arr[0];
		arr[0]=arr[len-1];
		arr[len-1]=temp;

		System.out.println(Arrays.toString(arr));
	}
}