import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={10,20,30,40,50,60};
		int len=arr.length;
		int newarr[]=new int[2];
		int j=0;

		for(int i=0;i<len;i++){

			if(i==0 || i==len-1){

				newarr[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(newarr));
	}
}