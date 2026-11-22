import java.util.*;
class Demo{

	public static void main(String[]args){

		HashMap hm = new HashMap();

		hm.put(1,10);
		hm.put(2,20);
		hm.put(3,30);
		hm.put(4,40);

		System.out.println(hm);

		for(Object i : hm.keySet()){	

   			 System.out.println(i);
		}
	}
}