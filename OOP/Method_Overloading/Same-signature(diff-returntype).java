class Codex{

	void fun(int a){

		System.out.println();
	}

	int fun(int a){

		System.out.println(a);
		
	}
}
class Demo{

	public static void main(String[]args){
	
		Codex c=new Codex();
		c.fun(10);
		c.fun(20);
	}
}


error: method fun(int) is already defined in class Codex
        int fun(int a){
            ^


return type does not matter in method overloading it depends on methoid name and signature