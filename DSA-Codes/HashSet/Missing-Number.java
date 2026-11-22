import java.util.*;
class Demo{

	static int solution(int arr[]){

		HashSet<Integer> hs = new HashSet<Integer>();

		int sum=0;
		
		for(Integer i:arr){

			hs.add(i);
			sum=sum+i;
		}
		int n=hs.size();
		int missing=(n*(n+1)/2);
		
		return missing-sum;
	}

	public static void main(String[]args){

		int arr[]={3,0,1};
		
		System.out.println(solution(arr));
	}
}