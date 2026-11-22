class Parent{

	void fun(){

		System.out.println("in parent fun");
	}
}
class Child extends Parent{

	final void fun(){

		System.out.println("in child fun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

op:in child fun

child can override mthd and make it final do childs chils cannot override it