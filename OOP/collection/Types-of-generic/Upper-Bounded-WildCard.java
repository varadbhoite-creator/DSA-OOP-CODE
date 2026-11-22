import java.util.*;
class Demo{

	static void display(ArrayList<? extends String> list){

		for(String n:list){
			
			System.out.println(n);
		}
	}
	public static void main(String[]args){

		ArrayList<String> al=new ArrayList<String>();
		al.add("varad");
		al.add("abc");

		display(al);
	}
}