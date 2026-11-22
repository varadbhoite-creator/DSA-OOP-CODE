import java.util.*;
class Demo{

	static int solution(int arr[]){

		HashSet<Integer> hs = new HashSet<Integer>();

		for(Integer i:arr){

			hs.add(i);
		}

		return hs.size();
	}
	
	public static void main(String[]args){

		int arr[]={1,2,3,1,2,3,4,3,6};

		System.out.println(solution(arr));
	}
}