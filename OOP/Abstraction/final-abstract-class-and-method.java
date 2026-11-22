final class Parent{
	
	private abstract void fun();
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


error: illegal combination of modifiers: abstract and private
        private abstract void fun();
                              ^
final-abstract-class-and-method.java:5: error: cannot inherit from final Parent
class Child extends Parent{