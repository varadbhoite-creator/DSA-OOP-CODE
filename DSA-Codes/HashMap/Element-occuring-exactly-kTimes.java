import java.util.*;
class Demo{

	static void solution(int arr[],int k){

		HashMap<Integer,Integer> hs=new HashMap();

		for(Integer i : arr){

			hs.put(i,hs.getOrDefault(i,0)+1);
		}

		for(Integer i :arr){

			if(hs.get(i)==k){

				System.out.println(i);
				hs.put(i,0);
			}
		}
	}
	public static void main(String[]args){

		int arr[]={1,2,2,3,3,3,4,1};

		int k=2;

		solution(arr,k);
	}
}