class Parent{

	int a=10;
}
class Child extends Parent{

	int a=20;
	
	void fun(){
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
Supar keyword contains reference of parent child it go to the oparent child directly