class Codex{

	static int a;

	static{

		a=10;
		System.out.println("in static");
	}
}
class Demo{

	public static void main(String[]args){

		System.out.println(Codex.a);
	}
}