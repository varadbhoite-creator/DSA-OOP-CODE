class Parent{

	int a=10;
}
class Child extends Parent{

	int a=50;
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		System.out.println(c.a);
		System.out.println(((Parent)c).a);
	}
}