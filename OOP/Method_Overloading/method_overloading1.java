class Codex{

	void fun(int a){

		System.out.println(a);
	}	

	void fun(int a,int b){

		System.out.println(a+b);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		c.fun(10);
		c.fun(10,20);
	}
}
op=
10
30