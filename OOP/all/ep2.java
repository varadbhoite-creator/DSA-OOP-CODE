class Demo{

	public static void main(String[]args){

		try{

			System.out.println("hello");
			System.out.println(10/0);
			System.out.println("world");
		}catch(ArithmeticException e){

			System.out.println("cannot divide by zero");
		}
		System.out.println("varad");
	}
}