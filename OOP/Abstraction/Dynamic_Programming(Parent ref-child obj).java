class Parent{

	abstract void fun();

	void gun(){

		System.out.println("in parent gun");
	}
}
class Child extends Parent{

	void fun(){

		System.out.println("in child fun");
	}
}
class Demo{

	public static void main(String[]args){

		Parent p=new Child();
		p.fun();
		p.gun();

		Child c=new Child();
		c.fun();
		c.gun();
	}
}