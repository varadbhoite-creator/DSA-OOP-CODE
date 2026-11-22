import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr1[]={1,3,5};
		int arr2[]={2,4,6};
		int len=arr1.length+arr2.length;
		int newarr[]=new int[len];
		int j=0;
		int k=0;
	
		for(int i=0;i<len;i++){

			if(i%2==0){

				newarr[i]=arr1[j];
				j++;
			}else{

				newarr[i]=arr2[k];
				k++;
			}
		}
		System.out.println(Arrays.toString(newarr));
	}
}