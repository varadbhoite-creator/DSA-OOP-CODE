interface Parent{

	static void fun(){

		System.out.println("in static fun");
	}
}
class Child implements Parent{

	
}
class Demo{

	public static void main(String[]args){

		Parent.fun();
	}
}

op:in static fun

bytecode:internally//

 public static void fun();

static method internally public aste.