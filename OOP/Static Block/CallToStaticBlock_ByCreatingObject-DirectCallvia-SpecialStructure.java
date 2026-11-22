class Codex{

	static int a;

	static{

		a=10;
		System.out.println(10);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
	}
}