import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5};
		int len=arr.length;
		int tar=3;
		int k=len-tar+1;
				
		for(int i=1;i<=k;i++){

			for(int j=0;j<len-1;j++){
		
				int temp=arr[j];
				arr[j]=arr[len-1];
				arr[len-1]=temp;
			
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}