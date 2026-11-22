import java.util.*;
class Demo{

	static void solution(int arr[]){

		HashMap <Integer , Integer> hm = new HashMap();

		for(Integer i : arr){

			hm.put(i,hm.getOrDefault(i,0)+1);
		}

		for(Map.Entry<Integer,Integer>Entry:hm.entrySet()){

			if(Entry.getValue()==1){

				System.out.println(Entry.getKey());
			}
		}
	}

	public static void main(String[]args){

		int arr[]={1,2,2,3,4,4,5};

		solution(arr);
	}
}