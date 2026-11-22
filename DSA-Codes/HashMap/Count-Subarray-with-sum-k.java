import java.util.*;
class Demo{

	static int solution(int arr[],int k){

		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int sum=0;
	
		for(int i=0;i<arr.length;i++){

			sum=sum+arr[i];

			if(sum==k){

				hm.put(i,sum);
				sum=0;
			}
		}
		return hm.size();
	}
	
	public static void main(String[]args){

		int arr[]={1,-1,1,-1};
		int k=0;

		System.out.println(solution(arr,k));
	}
}