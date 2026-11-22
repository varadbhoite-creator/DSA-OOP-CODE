class Codex<T>{

	T a;

	Codex(T a){

		this.a=a;
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex(10);
		Codex c1=new Codex("abc");
			
		System.out.println(c.a);
		System.out.println(c1.a);
	}
}

op;

10
abc

means we can write any thing to one variable whose type is t under that and data can be stored and accessed is called type parameter