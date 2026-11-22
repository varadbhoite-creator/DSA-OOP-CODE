import java.util.*;
class Demo{

	static void solution(int arr[]){

		HashMap <Integer , Integer> hm = new HashMap();

		int min=arr[0];

		for(Integer i : arr){

			hm.put(i,hm.getOrDefault(i,0)+1);
		}

		for(Map.Entry<Integer,Integer>Entry : hm.entrySet()){

			if(Entry.getValue()<=min){

				min=Entry.getValue();
				System.out.println(Entry.getKey());
			}
		}
		System.out.println(hm);
	}

	public static void main(String[]args){

		int arr[]={1,1,2,2,2,3,4};
		
		solution(arr);
	}
}