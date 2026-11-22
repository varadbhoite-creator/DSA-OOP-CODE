class Parent extends Object{

	int a=10;
	
	void display(){

		System.out.println(a);
	}
}
class Child extends Parent{

	int b=20;

	void fun(){

		System.out.println(a);
		System.out.println(b);
		System.out.println(super.a);
		System.out.println(super.b);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
		c.display();
	}
}

error-cannot find symbole b in parent class od child that is parent.