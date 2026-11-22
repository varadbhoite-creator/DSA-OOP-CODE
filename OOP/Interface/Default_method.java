interface Parent{

	default void fun(){

		System.out.println("in parent fun");
	}

	void gun();
}
class Child implements Parent{

	public void gun(){

		System.out.println("in gun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
		c.gun();
	}
}

op:in parent fun
   in gun

default method public aste internally