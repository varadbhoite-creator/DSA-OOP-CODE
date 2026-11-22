import java.util.*;
class Demo{

	public static void main(String[]args){

		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);

		Iterator itr=al.iterator();

		while(itr.hasNext()){

			System.out.println(itr.next());
		}
	}
}

10
20