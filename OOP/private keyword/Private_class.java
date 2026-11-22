private class Codex{

	int a=10;
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		System.out.println(c.a);
	}
}


 error: modifier private not allowed here
private class Codex{


class cannot be private we cannot do anything with that class if it is private.