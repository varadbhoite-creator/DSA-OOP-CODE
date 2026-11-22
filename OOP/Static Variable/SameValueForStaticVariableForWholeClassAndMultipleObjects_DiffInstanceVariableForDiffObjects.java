class Codex{

	static int b;
	private int a;

	Codex(int a){

		this.a=a;
	}

	void setA(int a){

		this.a=a;
	}

	int getA(){

		return a;
	}
}	
class Demo{

	public static void main(String[]args){

		Codex c1=new Codex(10);
		Codex c2=new Codex(20);

		System.out.println(c1.getA());
		System.out.println(c2.getA());

		System.out.println(c1.b);
		System.out.println(c2.b);

		c2.b=50;
		System.out.println(c1.b);
		System.out.println(c2.b);

		Codex.b=60;
		System.out.println(c1.b);
		System.out.println(c2.b);

		c1.setA(30);
		System.out.println(c1.getA());
		System.out.println(c2.getA());

		c2.b=100;
		System.out.println(c1.b);		
	}
}