class Parent{

	int a=10;
}
class Child extends Parent{

	int a=20;
	
	void fun(){

		System.out.println(this.a);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

op=20;
this keyword contains address of child class from which objdect is made and for whose constructor suprer has called parent constructor.