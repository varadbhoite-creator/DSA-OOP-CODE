import java.util.*;
class Demo{

	public static void main(String[]args){

		HashMap hs = new HashMap();
		
		hs.put(18,"virat");
		hs.put(45,"rohit");
		hs.put(1,"kl");
		hs.put(33,"hardik");
		hs.put(93,"boom");

		System.out.println(hs);

		System.out.println(hs.containsKey(1));  //true

		System.out.println(hs.containsKey(10));  //false
	}
}


op:

true
false