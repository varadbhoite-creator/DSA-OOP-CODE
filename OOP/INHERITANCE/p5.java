class A{

	int a;

	A(int a){
		super();
		this.a=a;
		System.out.println("in const a");
	}
	void fun(){

		System.out.println(a);
	}
}
class B extends A{

	B(int a){

		super(a);
		System.out.println("in const b");
	}
	void gun(){

		System.out.println(a);
	}

}
class Demo{

	public static void main(String[]args){

		B b=new B(20);
		b.fun();
		b.gun();
	}
}