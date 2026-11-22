class Demo{

	public static void main(String[]args){

		try{

			System.out.println(10/2);
			System.out.println(args[9]);

		}catch(ArithmeticException e){

			System.out.println("infinity");

		}catch(ArrayIndexOutOfBoundsException e){

			System.out.println("out of length");

		}
	}
}

op:
5
out of length