interface Parent{

	default void fun(){

		System.out.println("in fun");
	}
	
}
class Child implements Parent{

	public void fun(){

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

default method override hotat.