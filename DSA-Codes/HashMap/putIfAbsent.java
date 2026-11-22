import java.util.*;
class Demo{

	public static void main(String[]args){

		HashMap hs = new HashMap();
		
		hs.put(18,"virat");
		hs.put(45,"rohit");
		hs.put(1,"kl");
		hs.put(33,"hardik");
		hs.put(93,"boom");

		System.out.println(hs);  //{1=kl, 33=hardik, 18=virat, 45=rohit, 93=boom}

		hs.putIfAbsent(2,"varad");
	
		//System.out.println(hs);  //{1=kl, 33=hardik, 18=virat, 2=varad, 45=rohit, 93=boom}

		//System.out.println(hs.putIfAbsent(31,"yash"));  //null

		//System.out.println(hs.putIfAbsent(1,"varad"));  //kl

		//System.out.println(hs);  //{1=kl, 33=hardik, 18=virat, 2=varad, 45=rohit, 93=boom, 31=yash}

		System.out.println(hs.putIfAbsent(15,"abc"));

		System.out.println(hs);
	}
}