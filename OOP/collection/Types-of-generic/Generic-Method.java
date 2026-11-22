class Codex<T>{

	T a;

	Codex(T a){

		this.a=a;
	}

	T fun(){

		return a;
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex(10);
		System.out.println(c.fun());

		Codex c1=new Codex("varad");
		System.out.println(c1.fun());			
	}
}