import java.util.*;
class Demo{

	public static void main(String[]args){

		ArrayList<String> al=new ArrayList<String>();
	
		al.add("aabc");
		al.add("ab");

		Iterator itr = al.iterator();

		while(itr.hasNext()){

			System.out.println(itr.next());
			
		}
	}
}

op:

aabc
abc