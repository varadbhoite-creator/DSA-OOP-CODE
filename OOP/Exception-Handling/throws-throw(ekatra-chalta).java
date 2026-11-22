class AgeCheckException extends Exception{

	AgeCheckException(String msg){

		super(msg);
	}
}
class Demo{
	
	static int age=17;

	static void fun()throws AgeCheckException{

		if(age<18){

			throw new AgeCheckException("age invalid");
		}else{

			System.out.println("valid");
		}
	}

	public static void main(String[]args)throws AgeCheckException{

		fun();
	}
}