class A{

	int a=10;
}
class B{

	void display(){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		B b = new B();
		b.display();
	}
}

error: cannot find symbol
                System.out.println(a);
                                   ^