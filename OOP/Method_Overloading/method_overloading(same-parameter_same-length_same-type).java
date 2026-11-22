class Codex{

	void fun(int a){	

		System.out.println(a);
	}
	
	void fun(int a){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c = new Codex();
		c.fun(10);
	}	
}

error: method fun(int) is already defined in class Codex
        void fun(int a){
             ^