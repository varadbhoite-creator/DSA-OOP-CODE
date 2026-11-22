import java.util.*;
class Demo{

	public static void display(ArrayList <? super Integer> list){

		list.add(20);
		list.add(30);

		System.out.println(list);
	}
	public static void main(String[]args){

		ArrayList<Integer> a=new ArrayList();
		ArrayList<Object> b=new ArrayList();
		ArrayList<Number> c=new ArrayList();

		display(a);
		display(b);
		display(c);		
	}
}