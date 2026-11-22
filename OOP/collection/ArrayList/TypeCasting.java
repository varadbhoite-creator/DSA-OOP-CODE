import java.util.*;
class Demo{

	public static void main(String[]args){

		ArrayList al=new ArrayList();

		al.add("abc");
		al.add("ab");
		al.add("abcde");

		System.out.println(al);

		for(Object o : al){

			String s=(String)o;
			System.out.println(s.length());
		}
	}
}

[abc, ab, abcde]
3
2
5