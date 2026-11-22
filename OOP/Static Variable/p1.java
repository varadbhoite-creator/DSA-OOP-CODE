class Codex{

	private static int a=10;
	
	static void setA(int a){

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

		Codex.setA(40);
		System.out.println(c.getA());

		
		
	}
}