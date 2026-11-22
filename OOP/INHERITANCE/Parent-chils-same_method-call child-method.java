class Parent{

	int a=10;
		
	void fun(){

		System.out.println(a+"in parent");
	}
}
class Child extends Parent{

	void fun(){

		System.out.println(a+"in child");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
		c.fun();
	}
}