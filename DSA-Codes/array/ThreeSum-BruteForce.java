import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,1,-2,-2,0,0};
		int len=arr.length;
		int sum=0;

		for(int i=0;i<len-2;i++){

			for(int j=i+1;j<len-1;j++){

				sum=arr[i]+arr[j];
				
				for(int k=j+1;k<len;k++){
					
					if(i!=k){

						if(sum+arr[k]==0){

							System.out.print(arr[i]);
							System.out.print(arr[j]);
							System.out.println(arr[k]);
						}
					}
				}
			}

		}
	}
}