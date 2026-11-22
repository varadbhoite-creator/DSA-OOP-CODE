import java.util.*;
class Demo{

	public static void main(String[]args){

		String arr[]={"Mango","Apple","Banana","Orange"};
		int len=arr.length;

		for(int i=0;i<len-1;i++){

			for(int j=0;j<len-1-i;j++){

				if(arr[j]>arr[j+1]){

					String temp=arr[j];
					String[j]=String[j+1];
					String[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}