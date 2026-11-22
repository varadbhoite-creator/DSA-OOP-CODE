class Parent{

	void fun(){

		System.out.println("in parent fun");
	}

	void gun(){

		System.out.println("in parent gun");
	}
}
class Child extends Parent{

	void fun(){

		System.out.println("in child fun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
		c.gun();
	}
}	

op:     in child fun
	in parent gun