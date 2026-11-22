import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr1[]={5};
		int arr2[]={10};
		int len1=arr1.length;
		int len2=arr2.length;
		int newarr[]=new int[len1+len2];
		int len=newarr.length;
		int a=0;

		for(int i=0;i<len;i++){

			if(i<len1){

				newarr[i]=arr1[i];
			}else{

				newarr[i]=arr2[a];
				a++;
			}
		}

		for(int i=0;i<len-1;i++){

			for(int j=0;j<len-1-i;j++){

				if(newarr[j]>newarr[j+1]){

					int temp=newarr[j];
					newarr[j]=newarr[j+1];
					newarr[j+1]=temp;
				}
			}
		}
		int median=0;
		if(len%2!=0){

			median=len/2;
			System.out.println(newarr[median]);
		}else{

			int mid=len/2;
			int mid1=(len-1)/2;
			median=(newarr[mid]+newarr[mid1])/2;
			System.out.println(median+0.5);
		}
	}
}