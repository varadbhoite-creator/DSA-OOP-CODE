class Codex{

	int a=10;
}
class Demo{

	public static void main(String[]args){

		Codex c=null;

		System.out.println(c.a);
	}
}


Exception in thread "main" java.lang.NullPointerException: Cannot read field "a" because "<local1>" is null
        at Demo.main(Null-Reference-of-obj.java:11)