class Codex{

	int a;
	static int b=10;
		
	Codex(int a){

		this.a=a;
	}
	void fun(){

		System.out.println(this.a);
		System.out.println(this.b);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex(20);
		c.fun();
	}
}