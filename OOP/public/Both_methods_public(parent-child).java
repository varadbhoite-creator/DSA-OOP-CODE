class Parent{

	public void fun(){

		System.out.println("in parent fun");
	}
}
class Child extends Parent{
	
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

overriding occurs here