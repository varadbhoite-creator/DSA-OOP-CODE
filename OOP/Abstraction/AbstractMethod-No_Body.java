class Parent{

	abstract void fun();
}
class Child extends Parent{

	
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
	}
}

error: Parent is not abstract and does not override abstract method fun() in Parent
class Parent{