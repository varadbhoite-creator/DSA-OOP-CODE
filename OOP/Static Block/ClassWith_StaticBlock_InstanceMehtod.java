class Codex{

	static{

		System.out.println("in static");
	}
	
	void fun(){

		System.out.println("in fun");
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		c.fun();
	}
}

op:	in static 
  	in fun