import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={-4,-2,-1,0,1,2,4};
		int len=arr.length;
		Arrays.sort(arr);
		int sum=0;

		for(int i=0;i<len-2;i++){

			for(int j=i+1;j<len-1;j++){

				for(int k=j+1;k<len;k++){

					if(arr[i]+arr[j]+arr[k]==sum){

						System.out.println(""+arr[i]+","+arr[j]+","+arr[k]);
					}
				}
			}
			if(arr[i+1]==arr[i]){
		
				i=i+1;
			}
		}
	}
}