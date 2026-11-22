abstract class Parent{

	Parent(){

		System.out.println("in parent");
	}
}
class Child extends Parent{

	Child(){

		System.out.println("in child");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
	}
}

in parent
in child


abstract class has a constructor ans simple class has