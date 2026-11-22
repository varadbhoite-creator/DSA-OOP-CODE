import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5};
		int len=arr.length;
		Boolean sorted=true;

		for(int i=0;i<len-1;i++){

			if(arr[i]>arr[i+1]){
			
				sorted=false;
				break;
			}
		}
		if(sorted){
			System.out.println(Arrays.toString(arr));
		}
	}
}