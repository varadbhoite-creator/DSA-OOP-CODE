class Parent{

	void fun();
}
class Child extends Parent{

	
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}


op:error: missing method body, or declare abstract
        void fun();