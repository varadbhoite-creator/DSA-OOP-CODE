import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={5,5,5,5};
		int len=arr.length;
		
		for(int i=0;i<len-1;i++){

			for(int j=0;j<len-1-i;j++){

				if(arr[j]>arr[j+1]){

					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int max=0;
		int temp=arr[0];
		int count=0;
		for(int k=0;k<len;k++){

			if(arr[k]==temp){

				count++;
				temp++;
			}
			if(count>max){
				max=count;
			}
			if((k+1)>len-1){

				break;
			}

			if(arr[k+1]!=temp){

				temp=arr[k+1];
				count=0;
			}
		}
		System.out.println(max);
	}
}