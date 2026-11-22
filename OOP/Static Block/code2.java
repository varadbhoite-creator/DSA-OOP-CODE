class Codex{

	int a;
	static int b;

	static{

		System.out.println("in static");	
	}
	Codex(int a){

		this.a=a;
	}
	void fun(){

		System.out.println(a);
		System.out.println(b);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex(10);
		c.b=20;
		c.fun();
	}
}

op:
in static
10
20