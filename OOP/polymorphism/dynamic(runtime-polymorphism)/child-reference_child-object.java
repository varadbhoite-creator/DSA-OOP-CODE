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

		Child c=new Child();
		c.fun();
	}
}

op: in child fun 
	
    compile binds with child class and also the jvm call the methos fo child only bcoz reference is of child and also the object is of child