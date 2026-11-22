abstract class Parent{

	abstract void fun();

	void gun(){

		System.out.println("in parent gun");
	}
}
class Child extends Parent{

	void fun(){

		System.out.println("in child fun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
		c.gun();
	}
}

op:   in child fun
	in parent gun

	//void gun(){

			System.out.println("in parent gun");    // concrete method
	}

in abstract class both method can be there abstract and concrete. 
abstract the will be compulsary to override and give body.
concrete that depends on child to take as it is or override. 
