class Codex{

	private static int a=10;
	
	void setA(int a){

		this.a=a;
	}
	static int getA(){

		return a;
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		System.out.println(c.getA());
		System.out.println(Codex.getA());

		c.setA(20);
		System.out.println(c.getA());
		System.out.println(Codex.getA());		
		
	}
}