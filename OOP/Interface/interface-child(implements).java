interface Parent{

	void fun();
}
class Child implements Parent{

	public void fun(){

		System.out.println("in chilf fun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

op:in child fun

child interface la IMPLEMENTS karto.