class Codex{

	static{

		System.out.println("in static");
	}
	static void fun(){

		System.out.println("in fun");
	}
}
class Demo{

	public static void main(String[]args){

		Codex.fun();
	}
}

op: in static 
    in fun