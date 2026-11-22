class Codex{

	static int a=10;
	int b=20;

	static void fun(){

		System.out.println(a);
		System.out.println(this.b);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		c.fun();
		Codex.fun();
	}
}

 error: non-static variable this cannot be referenced from a static context
                System.out.println(this.b);   because in static methos this variable is not there so is do not get passed.