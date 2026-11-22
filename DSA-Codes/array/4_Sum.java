import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,0,-1,0,-2,2,2};
		int tar=0;
		int len=arr.length;
		Arrays.sort(arr);
	
		for(int i=0;i<=len-4;i++){

			for(int j=i+1;j<=len-3;j++){

				for(int k=j+1;k<=len-2;k++){

					for(int l=k+1;l<=len-1;l++){
			
						int sum=0;
						sum=arr[i]+arr[j]+arr[k]+arr[l];
						if(sum==tar){

							System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+","+arr[l]+")");
						}						
					}
				}
			}
		}
	}
}