import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int len=arr.length;
		int mid=(len-1)/2;
		int firstmid=mid/2;
		int secmid=mid+halfmid;
		for(int i=mid+1;i<secmid;i++){

			int temp=arr[i];
			arr[i]=arr[len-i+mid];
			arr[len-i+mid]=temp;
		}		
		
	}
}