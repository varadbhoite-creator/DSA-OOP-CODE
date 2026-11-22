class Demo{

	public static void main(String[]args){

		try{

			System.out.println(10/5);
			System.out.println(args[5]);
		}catch(ArithmeticException e){


			try{

				System.out.println(10/0);
			}catch(ArithmeticException ex){

				System.out.println("catched");
			}
		}catch(Exception e){

			System.out.println("catched 2");
		}
		System.out.println("hello");
	}
}