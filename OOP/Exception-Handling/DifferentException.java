class Demo{

	public static void main(String[]args){

		try{

			System.out.println("hello");	
			System.out.println(args[8]);
		}catch(ArithmeticException e){

			System.out.println("infinity");
		}
	}
}


hello
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 0
        at Demo.main(DifferentException.java:8)


error nhi det jr te handle karayla class nasel seprate tr direct exception dakhavta handle  hi hoth exception.