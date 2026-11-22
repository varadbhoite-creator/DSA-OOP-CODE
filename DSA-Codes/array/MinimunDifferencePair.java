import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={10,22,14,17,30};
		int len=arr.length;
		int min=arr[0];
		int a=0;
		int b=0;
		int diff=0;
		
		for(int i=0;i<len-1;i++){

			for(int j=0;j<len-1;j++){

				if(arr[j]<arr[j+1]){

					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<len-1;i++){

			for(int j=i+1;j<len;j++){
	
				diff=arr[i]-arr[j];
				
				if(diff<min){

					min=diff;
					a=arr[i];
					b=arr[j];
				}
			}
		}
		System.out.println("("+a+","+b+")");
	}
}