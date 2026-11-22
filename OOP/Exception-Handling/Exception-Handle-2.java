class Demo{

	public static void main(String[]args){

		try{
		
			System.out.println("hello");

			System.out.println(10/0);
		}catch(ArithmeticException e){

			System.out.println("infnity");
		}
	}
}

op:
hello
infnity