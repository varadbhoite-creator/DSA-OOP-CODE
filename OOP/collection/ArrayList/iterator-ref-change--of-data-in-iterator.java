import java.util.*;
class Demo{

	public static void main(String[]args){

		ArrayList al=new ArrayList();

		al.add("abc");
		al.add("ab");

		Iterator itr = al.iterator();

		while(itr.hasNext()){

			String s=(String)itr.next();
			System.out.println(s.length());
		}
	}
}

3
2