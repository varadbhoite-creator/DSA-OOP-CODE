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

	void shopping(){

		System.out.println("shopping");
	}
}
class Demo{

	public static void main(String[]args){

		Parent p=new Child();
		p.fun();
		p.gun();
		p.shopping();  //error shopping doesn not get in parent to compile.

		Child c=new Child();
		c.fun();
		c.gun();
		c.shopping();
	}
}

Parent p=new Child();
only parent accessed methods are called by this abject means the data which is child taking from parent that timee we make like this object.