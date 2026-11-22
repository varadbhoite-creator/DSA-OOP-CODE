class Codex{

	static int a=10;
	int b=20;
	
	void fun(){

		System.out.println(a);
		System.out.println(b);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		c.fun();
	}
}