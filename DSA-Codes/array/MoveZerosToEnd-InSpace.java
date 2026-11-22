import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={0,5,0,3,8,0,2};
		int len=arr.length;

		for(int i=0;i<len-1;i++){

			for(int j=0;j<len-1-i;j++){

				if(arr[j]==0){

					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}