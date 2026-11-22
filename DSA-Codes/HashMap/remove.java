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

		hs.remove(1);

		System.out.println(hs);  //{33=hardik, 18=virat, 45=rohit, 93=boom}

		System.out.println(hs.remove(18));  //virat

		System.out.println(hs);  //{33=hardik, 45=rohit, 93=boom}
	}
}