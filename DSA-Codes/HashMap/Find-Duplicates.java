import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={10,20,10,30,20,40,50,10};

		HashMap <Integer , Integer> hm = new HashMap();

		for(Integer i : arr){

			hm.put(i,hm.getOrDefault(i,0)+1);
		}

		for(Map.Entry<Integer , Integer > Entry : hm.entrySet()){

			if(Entry.getValue()>1){

				System.out.println(Entry.getKey());
			}
		}
	}
}