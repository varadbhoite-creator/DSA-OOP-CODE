class Codex{

	final int a;

	Codex(int a){

		this.a=a;
	}
}
class Demo{

	public static void  main(String[]args){

		Codex c=new Codex(10);
		c.a=20;
		System.out.println(c.a);
	}
}

error: cannot assign a value to final variable a
                c.a=20;
                 ^