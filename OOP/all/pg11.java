class Codex{

	private int a;
	
	Codex(int a){

		this.a=a;
	}

	public static Codex getInstance(int a){

		return new Codex(a);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=Codex.getInstance(10);
		Codex c1=Codex.getInstance(20);

		System.out.println(c==c1);
	}
}