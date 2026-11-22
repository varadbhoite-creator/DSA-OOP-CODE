class Parent{

	void fun(int a,int b){
	
		System.out.println(a+b);
	}
}
class Child extends Parent{

	void fun(int a){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun(1,2);
		c.fun(1);
	}
}
op=3,1