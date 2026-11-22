class Parent{

	final void fun(){

		System.out.println("in parent fun");
	}
}
class Child extends Parent{

	final void fun(){

		System.out.println("in child fun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

 error: fun() in Child cannot override fun() in Parent
        final void fun(){
                   ^
  overridden method is final  

once method is final then it cannot been override in child class because once methos is final we cannot make changes in its implementation