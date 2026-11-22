class Codex{

	int a=10;

	private Codex(){

		
	}

	static Codex getCodex(){

		return new Codex();
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=Codex.getCodex();
		System.out.println(c.a);
	}
}