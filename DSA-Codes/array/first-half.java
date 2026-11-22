import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={2,4,6,8,10,12};
		int len=arr.length;
		int mid=(len)/2;
		int newarr[]=new int[mid];

		for(int i=0;i<mid;i++){

			newarr[i]=arr[i];
		
		}
		System.out.println(Arrays.toString(newarr));
	}
}