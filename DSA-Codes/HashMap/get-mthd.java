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


		System.out.println(hs.get(45));  //rohit
		System.out.println(hs.get(18));  //virat
	
		System.out.println(hs.get(10));  //null
	}
}

op:

{1=kl, 33=hardik, 18=virat, 45=rohit, 93=boom}
rohit
virat
null
