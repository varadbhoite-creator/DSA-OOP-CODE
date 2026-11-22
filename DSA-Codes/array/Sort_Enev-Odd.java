import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5};
		int len=arr.length;
		int mid=0;	
		if(len%2==0){
			mid=(len/2)-1;
		}else{
			mid=len/2;
		}

		for(int i=0;i<=mid;i++){

			for(int j=0;j<len-1;j++){

				if(arr[j]%2!=0){

					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}