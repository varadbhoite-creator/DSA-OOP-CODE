class Codex{
	
	int a=10;
	
	private Codex(){

	
	}

	static void object(){

		Codex c=new Codex();
	}

	void display(){

		System.out.println(c.a);
	}
}
class Demo{

	public static void main(){

		Codex.object();
		c.display();
	}
}

error: cannot find symbol
                System.out.println(c.a);
                                   ^