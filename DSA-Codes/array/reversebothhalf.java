import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5,6	};
		int len=arr.length;
		int mid=(len-1)/2;
		int firstmid=(mid)/2;
		int secmid=mid+firstmid;
		int temp=0;
		
		for(int i=0;i<firstmid;i++){

			temp=arr[i];
			arr[i]=arr[mid-i];
			arr[mid-i]=temp;
		}
		for(int i=mid+1;i<=secmid;i++){

			 temp=arr[i];
			arr[i]=arr[len-i+mid];
			arr[len-i+mid]=temp;
		}
		System.out.println(Arrays.toString(arr));		
		
	}
}