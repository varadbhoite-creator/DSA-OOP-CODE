import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,0,4,5};
		int len=arr.length;
		int max=0;
		for(int i=0;i<len;i++){	

			if(arr[i]>max){

				max=arr[i];
			}
		}
		int freq[]=new int[max+1];
		for(int i=0;i<len;i++){

			if(arr[i]>=0){
				freq[arr[i]]++;
			}
		}
		int missing=0;
		int len1=freq.length;
		for(int i=1;i<len1;i++){

			if(freq[i]==0){

				missing=i;
				break;
			}else{

				missing=len1;
			}
		}
		System.out.println(missing);
	}
}