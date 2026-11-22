import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,2,3,3,3,4,4};
		HashMap<Integer , Integer> hs=new HashMap();
		for(Integer i:arr){

			hs.put(i,hs.getOrDefault(i,0)+1);
		}

		for(Map.Entry<Integer , Integer>Entry : hs.entrySet()){

			
			if(Entry.getValue()==2){

				System.out.println(Entry.getKey());
			}
		}
	}
}