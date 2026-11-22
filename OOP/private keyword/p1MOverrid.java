class Parent{

	private void fun(){

		System.out.println("in parent");
	}
}
class Child extends Parent{

	void fun(){

		System.out.println("in child");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

op:in child

both the fun methoids are diff here ovw=erriding does not happens