class Codex{

	int a=10;

	void fun(){

		System.out.println(a);
	}
	
	void fun(){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		c.fun();
	}
}

error: method fun() is already defined in class Codex
        void fun(){
             ^