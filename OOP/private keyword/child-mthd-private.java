class Parent{

	void fun(){

		System.out.println("in parent");
	}
}
class Child extends Parent{

	private void fun(){

		System.out.println("in child");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

fun() in Child cannot override fun() in Parent
        private void fun(){
                     ^
  attempting to assign weaker access privileges; was package
child-mthd-private.java:20: error: fun() has private access in Child
                c.fun();