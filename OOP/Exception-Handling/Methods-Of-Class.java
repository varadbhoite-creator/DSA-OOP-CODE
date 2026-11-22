class Demo{

	public static void main(String[]args){

		try{

			System.out.println(10/0);

		}catch(ArithmeticException e){

			System.out.println("infinity");
	
			System.out.println(e.getMessage());  kashamule exeption alay ta sngta
			e.printStackTrace();	 exception kutun alay ta sngta trace thevta	
		}
	}
}

op:

infinity

/ by zero

java.lang.ArithmeticException: / by zero
        at Demo.main(Methods-Of-Class.java:7)