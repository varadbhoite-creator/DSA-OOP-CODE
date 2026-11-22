class Codex{

	void fun(int a){

		System.out.println(a);
	}

	int fun(int a,int b){

		System.out.println(a+b);
		return a;
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		c.fun(10);
		c.fun(10,20);
	}
}