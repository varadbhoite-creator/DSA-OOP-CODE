class Demo{

	public static void main(String[]args){

		try{

			System.out.println(10/0);
			System.out.println(args[9]);

		}catch(ArithmeticException e){

			System.out.println("infinity");

		}catch(ArrayIndexOutOfBoundsException e){

			System.out.println("out of length");

		}
	}
}

op

infinity

ja exception bhettay tithe jata catch la ani handle karta tyacha specific class asel tr elka tr mdhe 2 exception handke kru shakto 2 catch lihun.