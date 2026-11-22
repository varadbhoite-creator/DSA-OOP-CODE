final class Codex{

	int a=10;

	final void fun(int a){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		System.out.println(c.a);
		c.a=20;
		System.out.println(c.a);
		c.fun(30);
		c.fun(40);
	}
}