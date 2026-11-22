import java.util.*;
class Demo{
	
	static int[] solution(int arr[]){

		int len=arr.length;
		int sqr[]=new int[len];

		for(int i=0;i<len;i++){

			int sq=arr[i]*arr[i];
			sqr[i]=sq;
		}
		
		Arrays.sort(sqr);
		return sqr;
	}

	public static void main(String[]args){

		int arr[]={-4,-1,0,3,10};

		System.out.println(Arrays.toString(solution(arr)));
	}
}