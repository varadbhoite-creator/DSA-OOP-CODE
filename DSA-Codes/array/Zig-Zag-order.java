import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={6,5,4,3,2,1};
		int len=arr.length;
		int temp=len-1;
		int j=0;
		int newarr[]=new int[len];

		for(int i=0;i<len;i++){

			if(i%2==0){

				newarr[i]=arr[j];
				j++;
			}else{

				newarr[i]=arr[temp];
				temp--;
			}
		}
		System.out.println(Arrays.toString(newarr));
	}
}