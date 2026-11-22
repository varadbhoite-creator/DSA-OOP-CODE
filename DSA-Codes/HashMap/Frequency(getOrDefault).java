import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,2,3,1,2};

		HashMap <Integer , Integer> hm = new HashMap();

		for(Integer i : arr){

			hm.put(i,hm.getOrDefault(i,0)+1);
		}

		for(Map.Entry<Integer , Integer>Entry : hm.entrySet()){

			System.out.println(Entry.getKey()+"="+Entry.getValue());
		}
	}
}