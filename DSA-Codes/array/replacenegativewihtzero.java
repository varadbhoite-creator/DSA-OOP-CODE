import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={5,-2,7,-8};
		int len=arr.length;
		
		for(int i=0;i<len;i++){

			if(arr[i]<0){

				arr[i]=0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}