class Codex{

	Codex(){

		System.out.println("in constructor");
	}
	static{

		System.out.println("in static block");
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
	}
}