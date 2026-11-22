import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={2,5,8,9};
		int len=arr.length;
		
		for(int i=0;i<len;i++){

			if(arr[i]%2==0){

				arr[i]=-1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}