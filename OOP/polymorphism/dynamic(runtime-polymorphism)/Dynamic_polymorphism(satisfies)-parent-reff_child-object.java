class Parent{

	void fun(){

		System.out.println("in parent fun");
	}
}
class Child extends Parent{

	void fun(){

		System.out.println("in child fun");
	}
}
class Demo{

	public static void main(String[]args){

		Parent p=new Child();
		c.fun();
	}
}

op:in child fun


   The reference is of parent do the compile binds the method of parent class but the object is of child so the jvm call the methos of the child
   means binds reference class and call objedt class