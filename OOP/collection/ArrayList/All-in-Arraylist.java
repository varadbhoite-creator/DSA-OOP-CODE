import java.util.*;
class Demo{
	
	public static void main(String[]args){

		ArrayList al=new ArrayList();
		al.add(10);
		al.add("abc");
		al.add(10.5);

		System.out.println(al);  //[10, abc, 10.5]

		for(Object o : al){

			System.out.println(o);
		}
	}
}

10
abc
10.5