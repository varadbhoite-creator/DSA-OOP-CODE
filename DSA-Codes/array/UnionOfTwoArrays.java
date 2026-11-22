import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr1[]={1,2,3,4,5,6,7,8,1};
		int arr2[]={3,4,5,6,7,8,9,0};
		int len=arr1.length+arr2.length;
		int newarr[]=new int[len];
		int j=0;

		for(int i=0;i<len;i++){

			if(i<arr1.length){

				newarr[i]=arr1[i];
			}else{

				newarr[i]=arr2[j];
				j++;
			}
		}
		int max=0;
		for(int i=0;i<len;i++){

			if(newarr[i]>max){

				max=newarr[i];
			}
		}
		int freq[]=new int[max+1];
		for(int i=0;i<len;i++){

			freq[newarr[i]]++;
		}
		for(int i=0;i<freq.length;i++){

			if(freq[i]!=0){

				System.out.println(i);
			}
		}
	}
}