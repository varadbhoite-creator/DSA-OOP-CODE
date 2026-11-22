class Codex<T extends Number>{

	t a;

	Codex(T a){

		this.a=a;
	}

	void fun(){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex(10);
		Codex c1=new Codex(20.5);
	}
}