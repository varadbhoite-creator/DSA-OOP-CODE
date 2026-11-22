class Parent{

	private int a=10;
}
class Child extends Parent{


}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		System.out.println(c.a);
	}
}

 error: a has private access in Parent
                System.out.println(c.a);


in inheritance also it cannot be accessed if it is private