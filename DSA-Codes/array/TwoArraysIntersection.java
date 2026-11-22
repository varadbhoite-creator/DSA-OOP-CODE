import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr1[]={1,2,3,4,5};
		int arr2[]={4,5,6,7};
		int len1=arr1.length;
		int len2=arr2.length;
		int max=0;

		for(int i=0;i<len1;i++){

			if(arr1[i]>max){

				max=arr1[i];
			}
		}
		for(int i=0;i<len2;i++){

			if(arr2[i]>max){

				max=arr2[i];
			}
		}

		int freq[]=new int[max+1];
		for(int i=0;i<len1;i++){

			freq[arr1[i]]++;
		}

		for(int i=0;i<len2;i++){

			if(freq[arr2[i]]>0){

				System.out.println(arr2[i]);
				freq[arr2[i]]--;
			}
		}
	}
}