class Codex{

	private int a;

	Codex(int a){

		this.a=a;
	}
	void seta(int a){

		this.a=a;
	}
	int geta(){

		return a;
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex(10);
		int b=c.geta();
		System.out.println(b);

		System.out.println("or");

		System.out.println(c.geta());
		
		System.out.println("after setused");
		c.seta(20);
		System.out.println(c.geta());
	}
}