class Codex{

	static int a=10;
	
	static void fun(){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){
		
		Codex.fun();
		Codex c=new Codex();
		c.fun();
		
	}
}