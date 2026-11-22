import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5,6};
		int len=arr.length;
		int mid=len/2;
		int arr1[]=new int[mid];
		int arr2[]=new int[mid];
		int j=0;
		int k=0;

		for(int i=0;i<len;i++){
			
			if(i<mid){

				arr1[j]=arr[i];
				j++;
			}else{

				arr2[k]=arr[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}