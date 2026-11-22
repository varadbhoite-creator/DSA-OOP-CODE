class Parent{

	void fun(){

		System.out.println("in parent");
	}
}
class Child extends Parent{

	void fun(int a){

		System.out.println("in child :"+a);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
		c.fun(10);
	}
}