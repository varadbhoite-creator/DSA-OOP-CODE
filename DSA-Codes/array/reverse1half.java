import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int len=arr.length;
		int mid=(len-1)/2;
		int halfmid=mid/2;
		
		for(int i=0;i<halfmid;i++){

			int temp=arr[i];
			arr[i]=arr[mid-i];
			arr[mid-i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}