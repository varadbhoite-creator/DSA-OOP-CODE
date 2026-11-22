class Codex{

	void fun(String a){

		System.out.println(a);
	}

	void fun(int a){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		c.fun("varad");
		c.fun(10);
	}
}