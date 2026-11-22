class Codex{

	static int a=10;
	static{

		System.out.println("in static");
	}

	void fun(){

		System.out.println("in fun");
	}
}
class Demo{

	public static void main(String[]args){

		System.out.println(Codex.a);
		Codex c=new Codex();
		System.out.println(c.a);
	
		Codex c1=new Codex();
	}
}