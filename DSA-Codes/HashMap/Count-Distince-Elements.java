import java.util.*;
class Demo{

	static int solution(int arr[]){

		HashMap <Integer ,Integer> hm = new HashMap();

		int count=0;

		for(Integer i:arr){

			hm.put(i,hm.getOrDefault(i,0)+1);
		}
		return hm.size();
	}

	public static void main(String[]args){

		int arr[]={1,2,2,3,3,3,4,4};

		System.out.println(solution(arr));
	}
}