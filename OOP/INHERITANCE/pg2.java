class Parent{

	int a=10;
	int b=20;

	void fun(){

		System.out.println(a);
		System.out.println(b);
	}
}
class Child extends Parent{

	int a=30;
	int b=40;

	void gun(){

		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
	}	
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
		c.gun();
		
		Parent p=new Parent();
		p.fun();
	}
}