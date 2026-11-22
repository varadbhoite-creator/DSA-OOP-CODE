import java.util.*;
class Demo{
	
	static int[] solution(int arr[]){

		int len=arr.length;
		int sqr[]=new int[len];

		for(int i=0;i<len;i++){

			int sq=arr[i]*arr[i];
			sqr[i]=sq;
		}
	
		int len1=sqr.length;

		for(int i=0;i<len1-1;i++){

			for(int j=0;j<len-j-1;j++){

				int temp=sqr[j];
				sqr[j]=sqr[j+1];
				sqr[j+1]=temp;
			}
		}
		return sqr;
	}

	public static void main(String[]args){

		int arr[]={-4,-1,0,3,10};
		
		int sqr[]=solution(arr);

		System.out.println(Arrays.toString(sqr));
	}
}