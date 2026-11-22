class Parent{

	void fun(int a){

		System.out.println(a);
	}
}
class Child extends Parent{

	void fun(int a){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun(10);
	}
}