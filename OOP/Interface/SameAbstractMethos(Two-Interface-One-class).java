interface Parent1{

	void fun();
}
interface Parent2{

	void fun();
}
class Child implements Parent1,Parent2{

	public void fun(){

		System.out.println("hello");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

op1:hello