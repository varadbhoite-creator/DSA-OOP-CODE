class Parent{

	int a=10;

	Parent(){

		super();
	}
}
class Child extends Parent{


	Child(){

		super();
	}

	void fun(){

		System.out.println(this.a);
		System.out.println(super.a);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

op=10
   10