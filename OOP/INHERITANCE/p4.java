class A{

	int a=10;

	A(){

		super();
		System.out.println("in const a");
	}
}
class B extends A{

	B(){

		super();
		System.out.println("in const b");
	}
}
class Demo{

	public static void main(String[]args){

		B b=new B();
	}
}