class Parent{
	
	final abstract void fun();
}
class Child extends Parent{

	void fun(){

		System.out.println("in child fun");
	}
}
class Demo{
	
	public static void main(String[]args){

		Child c=new Child();
		
	}
}

 error: illegal combination of modifiers: abstract and final
        final abstract void fun();
                            ^
final-abstract-method-1.java:1: error: Parent is not abstract and does not override abstract method fun() in Parent
class Parent{