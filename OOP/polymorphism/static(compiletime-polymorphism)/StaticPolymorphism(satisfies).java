class Parent{

	static void fun(){

		System.out.println("in parent fun");
	}
}
class Child extends Parent{

	static void fun(){

		System.out.println("in child fun");
	}
}
class Demo{

	public static void main(String[]args){

		Parent p=new Child();
		p.fun();
	}
}


op:in parent fun


	the reference of class who binds the class the jvm call that same class only so in this static case the overriding concept not works