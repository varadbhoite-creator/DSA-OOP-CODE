import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4};
		int len=arr.length;

		for(int i=0;i<len;i++){
	
			arr[i]=arr[i]*arr[i]*arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
}