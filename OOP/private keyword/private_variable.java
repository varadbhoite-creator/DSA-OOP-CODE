class Codex{

	private int a=10;
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		System.out.println(c.a);
	}
}

error: a has private access in Codex
                System.out.println(c.a);

private means which has access only in that class only it cannot be accessed form other class withput getter