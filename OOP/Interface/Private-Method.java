interface Parent{

	private void fun(){

		System.out.println("in private fun");
	}
		
	default void get(){

		fun();
	}
}
class Child implements Parent{

	
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.get();
	}
}

in private fun