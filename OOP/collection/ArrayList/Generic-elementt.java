import java.util.*;
class Demo{

	public static void main(String[]args){

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);

		for(Integer i:al){

			System.out.println(i);
		}
	}
}

[20, 30, 40]
20
30
40