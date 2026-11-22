interface Parent1{

	default void fun(){

		System.out.println("in parent1 fun");
	}
}
interface Parent2{

	default void fun(){

		System.out.println("in parent2 fun");
	}
}
class Child implements Parent1,Parent2{

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
