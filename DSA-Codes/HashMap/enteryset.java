import java.util.*;
class Demo{

	public static void main(String[]args){

		HashMap<Integer , String> hm=new HashMap();

		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(3,"c");
		hm.put(4,"d");

		for(Map.Entry < Integer , String > Entry : hm.entrySet()){

			System.out.println(Entry.getKey() + "=" + Entry.getValue());
		}
	}
}