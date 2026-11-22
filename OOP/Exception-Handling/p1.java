interface Codex{

	void fun();
}
abstract class Child implements Codex{

	
}
class Child1 extends Child{

	public void fun(){

		System.out.println("hello");
	}
}
class Demo{

	public static void main(String[]args){
		
		Child1 c=new Child1();
		c.fun();
	}
}