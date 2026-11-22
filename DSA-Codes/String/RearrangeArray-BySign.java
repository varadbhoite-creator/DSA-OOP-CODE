import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={3,1,-2,-5,2,4};	
		int len=arr.length;
		
		for(int i=0;i<len;i++){

			if(i%2==0){

				if(arr[i]<0){

					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			if(i%2!=0){

				if(arr[i]>0){

					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;

				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}