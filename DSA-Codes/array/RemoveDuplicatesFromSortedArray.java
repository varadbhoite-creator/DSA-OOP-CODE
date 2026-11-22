import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,1,2,2,3,4,4,5,5};
		int len=arr.length;
		int max=0;

		for(int i=0;i<len;i++){

			if(arr[i]>max){
				max=arr[i];
			}
		}

		int freqarr[]=new int[max+1];
		
		for(int j=0;j<len;j++){

			freqarr[arr[j]]++;
		}	
		
		for(int k=0;k<freqarr.length;k++){

				count++;			
			}
		}
		int newarr[]=new int[count];
		int a=0;

		for(int b=0;b<freqarr.length;b++){

			if(freqarr[b]>0){

				newarr[a]=b;
				a++;
			}
		}
		System.out.println(Arrays.toString(newarr));
