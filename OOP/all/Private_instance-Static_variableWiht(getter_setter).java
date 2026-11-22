class Codex{

	private static int a;
	private int b;
	
	static{
	
		a=10;
	}

	Codex(int b){

		this.b=b;
	}
		
	static int getA(){

		return a;
	}

	int getB(){
	
		return b;
	}
	
	static void setA(int a){

		Codex.a=a;
	}
	
	void setB(int b){

		this.b=b;
	}

}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex(20);
	
		System.out.println(Codex.getA());
		System.out.println(c.getB());

		Codex.setA(100);
		c.setB(200);
		
		System.out.println(Codex.getA());
		System.out.println(c.getB());

	}
}