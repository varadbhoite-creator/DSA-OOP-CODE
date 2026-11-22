class Codex{

	final int a=10;
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
		System.out.println(c.a);
		c.a=20;
		System.out.println(c.a);
	}
}

 error: cannot assign a value to final variable a
                c.a=20;
                 ^

once a variable is final and value is assigned to it then the value cannote be chaged again or valude cannot get updated