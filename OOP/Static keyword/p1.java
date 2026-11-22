class Codex{

	static void fun(){

		System.out.println("hello");
	}
	
	static void fun(int a){

		System.out.println("hello");
	}
}
class Demo{

	public static void main(String[]args){

		Codex.fun();
		Codex.fun(10);
	}
}