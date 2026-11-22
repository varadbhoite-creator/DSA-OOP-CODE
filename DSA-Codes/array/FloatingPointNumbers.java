import java.util.*;
class Demo{

	public static void main(String[]args){

		float arr[]={2.5f,1.1f,4.8f,3.2f};
		int len=arr.length;

		for(int i=0;i<len-1;i++){

			for(int j=0;j<len-1-i;j++){

				if(arr[j]>arr[j+1]){

					float temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}