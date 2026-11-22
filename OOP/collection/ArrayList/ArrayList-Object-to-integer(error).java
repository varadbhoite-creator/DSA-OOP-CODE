import java.util.*;
class Demo{

	public static void main(String[]args){

		ArrayList al=new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);

		
		for(Integer i:al){

			System.out.println(i);
		}
	}
}

java:13: error: incompatible types: Object cannot be converted to Integer
                for(Integer i:al){


jheva generic type det nahi apan theva ta object mhanun store hota ani abject ha sglyancha parent ahe tyamule integer jri class asla tri integer mdhe object basat nahi.