class Parent{

	void fun(){

		System.out.println("in parent fun");
	}
}
class Child extends Parent{

	static void fun(){

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
        static void fun(){
                    ^
  overriding method is static


 to override all the methos should be same we can change the implementation in methos but not a method we shoul take the methos as it is p[arent has