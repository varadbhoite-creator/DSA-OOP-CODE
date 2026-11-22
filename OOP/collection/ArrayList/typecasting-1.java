import java.util.*;
class Demo{

	public static void main(String[]args){

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);

		for(Object o:al){

			Integer a=(Integer)o;
			System.out.println(a);
		}
	}
}

10
20