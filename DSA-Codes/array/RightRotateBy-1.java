import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5};
		int len=arr.length;
		
		for(int i=0;i<len-1;i++){
		
			int temp=arr[i];
			arr[i]=arr[len-1];
			arr[len-1]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}