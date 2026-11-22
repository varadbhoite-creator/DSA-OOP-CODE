import java.util.*;
class Demo{

	public static void main(String[]args){

		ArrayList<String> al=new ArrayList<String>();

		al.add("abc");
		al.add("ab");

		Iterator<String> itr=al.iterator();

		while(itr.hasNext()){
			
			String s=itr.next();
			System.out.println(s);
			System.out.println(s.length());
		}
	}
}

abc
3
ab
2