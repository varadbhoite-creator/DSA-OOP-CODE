class A{

	int a=10;
}
class B extends A{

	void display(){

		System.out.println(this.a);
	}
}
class Demo{

	public static void main(String[]args){

		B b=new B();
		System.out.println(b);
		b.display();
	}
}