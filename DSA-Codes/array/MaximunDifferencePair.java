import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={10,22,14,17,30};
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
		int max=0;
		int a=0;
		int b=0;
		int diff=0;
		for(int i=0;i<len-1;i++){

			for(int j=i+1;j<len;j++){

				 diff=arr[i]-arr[j];

				if(diff>max){

					max=diff;
					a=arr[i];
					b=arr[j];
				}
			}
		}
		System.out.println("("+a+","+b+")");
	}
}