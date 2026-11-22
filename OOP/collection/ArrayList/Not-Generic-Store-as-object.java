import java.util.*;
class Demo{	

	public static void main(String[]args){

		ArrayList al=new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);

		System.out.println(al);

		for(Object o:al){

			System.out.println(o);
		}
	}
}

[10, 20, 30]
10
20
30