class Parent{

	int a;
	int b;

	Parent(int a,int b){

		this.a=a;
		this.b=b;
	}
	void fun(){

		System.out.println(a);
		System.out.println(b);
	}
}
class Child extends Parent{

	Child(int a,int b){

		super(a,b);
	}
	void gun(){

		System.out.println(a);
		System.out.println(b);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child(10,20);
		c.gun();

		Parent p=new Parent(30,40);
		p.fun();
	}
}