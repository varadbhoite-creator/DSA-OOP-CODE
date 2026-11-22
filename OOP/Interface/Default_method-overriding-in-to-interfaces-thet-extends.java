interface Parent1{

	default void fun(){

		System.out.println("in fun");
	}
}
interface Parent2 extends Parent1{

	default void fun(){

		System.out.println("in parent2 fun");
	}
}
class Child implements Parent2{

	
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

in parent2 fun