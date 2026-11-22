class Parent{
	int a;
	private Parent(){

		this.a=a;
	}

	static Parent getParent(){

		return new Parent();
	}
}
class Child extends Parent{

	Child(int a){

		super(a);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child(20);
	}
}


	parent private construftor cannot be aaccessed by inherited child.

	no use of super(0;