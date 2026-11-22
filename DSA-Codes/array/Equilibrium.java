import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={-7,1,5,2,-4,3,0};
		int len=arr.length;
		
		for(int i=0;i<len;i++){
			
			int Rsum=0;
			int Lsum=0;

			for(int j=i+1;j<len;j++){

				Rsum=Rsum+arr[j];
		
			}
			for(int j=0;j<i;j++){

				Lsum=Lsum+arr[j];
		
			}
	
			if(Rsum==Lsum){

				System.out.println(arr[i]);
				break;
			}
		}
	}
}