import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int len=arr.length;
		int mid=(len)/2;
		int newarr[]=new int[mid];
		int j=0;
		
		for(int i=0;i<len;i++){

			if(i%2==0){

				newarr[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(newarr));
	}
}