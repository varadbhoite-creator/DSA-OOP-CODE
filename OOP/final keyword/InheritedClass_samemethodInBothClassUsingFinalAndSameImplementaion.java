class Parent{

	final void fun(){

		System.out.println("in parent fun");
	}
}

class Child extends Parent{

	final void fun(){

		System.out.println("in parent fun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

 fun() in Child cannot override fun() in Parent
        final void fun(){
                   ^
  overridden method is final