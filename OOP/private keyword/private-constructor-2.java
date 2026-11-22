class Codex{

	int a=10;

	private Codex(){


	}

	static void object(){

		Codex c=new Codex();
	}

	static void display(){
		Codex c=new Codex();
		System.out.println(c.a);
	}
}
class Demo{

	public static void main(String[]args){

		Codex.object();
		Codex.display();
	}
}	

op:10