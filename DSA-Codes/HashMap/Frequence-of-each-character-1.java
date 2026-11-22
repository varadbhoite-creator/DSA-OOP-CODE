import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,1,3,2,1,1,1,1,1};
		
		HashMap <Integer , Integer> hm= new HashMap();

		for(int num : arr){

			if(!hm.containsKey(num)){

				hm.put(num,1);
			}else{

				hm.replace(num,hm.get(num)+1);
			}
		}
		
		for(Map.Entry < Integer , Integer > Entry : hm.entrySet()){

			System.out.println(Entry.getKey()+"="+Entry.getValue());
		}
	}
}