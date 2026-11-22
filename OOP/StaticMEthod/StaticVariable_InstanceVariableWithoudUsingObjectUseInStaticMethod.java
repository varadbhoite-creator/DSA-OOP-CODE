class Codex{

	static int a=10;
	int b=20;

	static void fun(){

		System.out.println(a);
		System.out.println(b);
	}
}
class Demo{

	public static void main(String[]args){

		Codex.fun(); //error is here instance variable is not stored in instance and is been called
		Codex c=new Codex();
		c.fun();
	}
}
 error: non-static variable b cannot be referenced from a static context
                System.out.println(b); beacuse instance variable has been tried to access withput creating object in by codex.fun method.