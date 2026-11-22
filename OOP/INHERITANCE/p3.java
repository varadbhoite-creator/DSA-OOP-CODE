class A{

	int a=10;
	
	void fun(){

		System.out.println(this.a);
	}
}
class B extends A{

	void gun(){

		System.out.println(this.a);
	}
}
class C extends B{

	void run(){

		System.out.println(this.a);
	}
}
class Demo{

	public static void main(String[]args){

		C c=new C();
		c.fun();
		c.gun();
		c.run();
	}
}