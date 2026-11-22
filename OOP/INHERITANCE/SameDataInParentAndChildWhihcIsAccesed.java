class Parent{

	int a=10;
}
class Child extends Parent{

	int a=20;
	
	void fun(){
		
		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

op-20
Child searches its own if ti haves than it takes own other wise search in parent is same data is there