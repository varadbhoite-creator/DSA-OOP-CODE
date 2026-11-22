final class Parent{

	int a=10;
}
class Child extends Parent{

	
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		System.out.println(c.a);
	}
}

 error:cannot inherit from final Parent
class Child extends Parent{