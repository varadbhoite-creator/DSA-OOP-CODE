interface Parent{

	static void fun(){

		System.out.println("in fun");
	}
}
class Child implements Parent{

	public static void fun(){

		System.out.println("in child fun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();

		Parent.fun();
	}
}

in chilf fun
in fun

static method overriding hoth nahi jyacha ref tyachi methos call hoti