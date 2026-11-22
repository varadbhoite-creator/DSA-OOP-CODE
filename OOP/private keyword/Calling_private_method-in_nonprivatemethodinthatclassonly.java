class Codex{

	private void fun(){

		System.out.println("hello");
	}

	void call(){

		fun();
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		c.call();
	}
}