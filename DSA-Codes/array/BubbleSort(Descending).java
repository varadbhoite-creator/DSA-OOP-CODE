import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,1,2,3,4,5,4,4,9,-9,-8,-7,-0,6,5,7,8,100};
		int len=arr.length;
	
		for(int i=0;i<len-1;i++){

			for(int j=0;j<len-1-i;j++){

				if(arr[j]<arr[j+1]){

					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}