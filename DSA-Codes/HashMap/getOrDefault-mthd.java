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

		System.out.println(hs.getOrDefault(18,-1)); //virat
		
		System.out.println(hs.getOrDefault(11,0));  //0
	}
}

op:

virat-alredy ahe ti dili
0-default