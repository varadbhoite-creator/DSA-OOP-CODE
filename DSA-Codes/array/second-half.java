import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={2,4,6,8,10,12};
		int len=arr.length;
		int mid=(len)/2;
		int j=0;
		int newarr[]=new int[mid];

		for(int i=mid;i<len;i++){
	
			newarr[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(newarr));
	}
}