class Codex{

	static int a;
	
	static{

		a=10;
		System.out.println("in static ");
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		System.out.println(c.a);
	}
}