import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={3,7,2,9,5};
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
		int min=arr[0];
		int a=0;
		int b=0;
		int product=0;
		for(int i=0;i<len-1;i++){

			for(int j=i+1;j<len;j++){

				product=arr[i]*arr[j];

				if(product<min){

					min=product;
					a=arr[i];
					b=arr[j];
				}
			}
		}
		System.out.println("("+a+","+b+")");
	}
}