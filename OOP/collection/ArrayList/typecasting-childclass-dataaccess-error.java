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

			System.out.println(o.a);
		}
	}
}

error: cannot find symbol
                        System.out.println(o.a);
                                            ^
  symbol:   variable a
  location: variable o of type Object
Note: typecasting-childclass-dataaccess-error.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error