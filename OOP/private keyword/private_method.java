class Codex{

	private void fun(){

		System.out.println("in fun");
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		c.fun();
	}
}

fun() has private access in Codex
                c.fun();