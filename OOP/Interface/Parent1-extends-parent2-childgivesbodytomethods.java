interface Parent1{

	void fun();
}
interface Parent2 extends Parent1{

	void gun();
}
class Child implements Parent2{

	public void fun(){

		System.out.println("in fun");
	}

	public void gun(){

		System.out.println("in gun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
		c.gun();
	}
}

op: in fun
    in gun