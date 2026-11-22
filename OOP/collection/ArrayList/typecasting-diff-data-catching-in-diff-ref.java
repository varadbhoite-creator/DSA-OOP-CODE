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

			String s=(String)o;
			System.out.println();
		}
	}
}

String s=(String)o;String s=(String)o;
Exception in thread "main" java.lang.ClassCastException: class Codex cannot be cast to class java.lang.String (Codex is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')
        at Demo.main(typecasting-diff-data-catching-in-diff-ref.java:16)
