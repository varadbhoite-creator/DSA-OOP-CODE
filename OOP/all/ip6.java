interface Calculator{

	private void display(){

		System.out.println("private interface method");
	}

	default void calculate(){

		display();
	}
}
class BasicCalculator implements Calculator{

	 
}
class Demo{

	public static void main(String[]args){

		BasicCalculator b=new BasicCalculator();
		b.calculate();
	}
}