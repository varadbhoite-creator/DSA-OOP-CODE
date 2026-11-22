class Parent{

	private void fun(){

		System.out.println("parent");
	}
}
class Child extends Parent{

	void fun(){

		System.out.println("child");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

<identifier> expected
        Private void fun(){
               ^