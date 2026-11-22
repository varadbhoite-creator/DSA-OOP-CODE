class Parent{

	void fun(){

		System.out.println("in parent fun");
	}
}
class Child extends Parent{

	void fun(){

		System.out.println("in child fun");
	}
	
	void gun(){

		System.out.println("in child gun");
	}
}
class Demo{

	public static void main(String[]args){

		Parent p=new Child();
		p.fun();
		p.gun();


		Parent p1=new Parent();
		p.fun();
	}
}