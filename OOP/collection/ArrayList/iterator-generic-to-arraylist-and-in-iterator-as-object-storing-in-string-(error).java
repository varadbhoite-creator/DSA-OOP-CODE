import java.util.*;
class Demo{

	public static void main(String[]args){

		ArrayList al=new ArrayList();

		al.add("abc");
		al.add("ab");

		Iterator itr = al.iterator();

		while(itr.hasNext()){

			String s=itr.next();
			System.out.println(s.length());
		}
	}
}


(error).java
iterator-generic-to-arraylist-and-in-iterator-as-object-storing-in-string-(error).java:15: error: incompatible types: Object cannot be converted to String
                        String s=itr.next();
                                         ^
Note: iterator-generic-to-arraylist-and-in-iterator-as-object-storing-in-string-(error).java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error