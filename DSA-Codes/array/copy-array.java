import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5};
		int len=arr.length;
		int newarr[]=new int[len];
		
		for(int i=0;i<len;i++){

			newarr[i]=arr[i];
		}
		System.out.println(Arrays.toString(newarr));
	}
}