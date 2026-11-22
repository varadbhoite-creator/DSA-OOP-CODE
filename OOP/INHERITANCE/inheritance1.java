class Parent{

	private int a;
	private int b;

	Parent(int a,int b){

		this.a=a;
		this.b=b;
	}
	void setA(int a){

		this.a=a;
	}
	void setB(int b){

		this.b=b;
	}
	int getA(){

		return a;
	}
	int getB(){

		return b;
	}
}
class Child extends Parent{

	private int c;

	Child(int a,int b,int c){

		super(a,b);
		this.c=c;
	}
	void setC(int c){

		this.c=c;
	}
	int getC(){

		return c;
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child(10,20,30);
		System.out.println("child info");
		System.out.println(c.getA());
		System.out.println(c.getB());
		System.out.println(c.getC());
	
		Parent p=new Parent(100,200);
		System.out.println("parent info");
		System.out.println(p.getA());
		System.out.println(p.getB());		
	}
}