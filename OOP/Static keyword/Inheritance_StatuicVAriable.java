class Parent{

	static int a=10;
}
class Child extends Parent{

	static int a=20;
}
class Demo{

	public static void main(String[]args){

		System.out.println(Parent.a);
		Child c=new Child();
		System.out.println(c.a);
	}
}