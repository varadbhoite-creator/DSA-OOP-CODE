class Codex{

	private int a=10;

	void seta(int a){

		this.a=a;
	}
	int geta(){

		return a;
	}
}
class Demo{

	public static void main(String[]args){
	
		Codex c=new Codex();	
		System.out.println(c.geta());

		c.seta(20);
		System.out.println(c.geta());
		
		Codex c1=new Codex();
		System.out.println(c1.geta());		
	}
}	