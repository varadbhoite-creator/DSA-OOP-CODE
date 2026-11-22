abstract class Parent{

	abstract void fun();

	void gun(){

		System.out.println("in parent gun");
	}
}
class Child extends Parent{

	void fun(){

		System.out.println("in child fun");
	}

	void gun(){

		System.out.println("in child gun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
		c.gun();
	}
}

in child fun
in child gun