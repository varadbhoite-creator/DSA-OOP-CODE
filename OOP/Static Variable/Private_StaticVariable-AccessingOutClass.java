class Codex{

	private static int a=10;
	
	int getA(){

		return a;
	}
}

class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		System.out.println(c.a);
		System.out.println(Codex.a);
	}
}

rror: a has private access in Codex
                System.out.println(c.a);
                                    ^
Private_StaticVariable.java:17: error: a has private access in Codex
                System.out.println(Codex.a);