class Codex<T extends Number>{

	T a;

	Codex(T a){

		this.a=a;
	}

	void fun(){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Codex<Integer> c=new Codex(10);
		Codex<Integer> c1=new Codex(20.5);

		c.fun();
		c1.fun();

		Codex c2=new Codex("abc");       //error: incompatible types: String cannot be converted to Number
                				 //Codex c2=new Codex("abc");
		c2.fun();  
	}
}