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
class Demo{

	public static void main(String[]args){

		B b=new B();
		b.fun();
		b.gun();
	}
}