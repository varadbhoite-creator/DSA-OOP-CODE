import java.util.*;
class Codex{

	int a=10;
}
class Demo{

	public static void main(String[]args){

		ArrayList al=new ArrayList();
		al.add(new Codex());
		al.add(new Codex());

		for(Object o:al){

			Codex c=(Codex)o;
			System.out.println(c.a);
		}
	}
}

10
10