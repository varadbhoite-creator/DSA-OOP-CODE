import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,3,4,5,4,4,3,2,5,6,0,-9,-0,-9,-8,-7,7,6,7,5};
		int len=arr.length;

		for(int i=0;i<len-2;i++){

			for(int j=0;j<len-1-i;j++){

				if(arr[j]>arr[j+1]){

					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}