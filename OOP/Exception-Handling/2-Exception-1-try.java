class Demo{

	public static void main(String[]args){

		try{

			System.out.println(10/0);	
			System.out.println(args[9]);
		}catch(ArithmeticException e){

			System.out.println("infinity");
		}
	}
}

infinity

1st exception sapadla ki khali catch mdhe janar tyamuke dusra exception handke ny honar