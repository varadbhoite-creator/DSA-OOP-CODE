class AgeCheckException extends Exception{

	
}
class Demo{

		static int age=19;

	static void fun(){

		try{

			if(age<18){

				throw new AgeCheckException();
			}else{

				System.out.println("age valid");
			}
		}catch(AgeCheckException e){

			System.out.println("catched");
		}
	}
	
	public static void main(String[]args){

		fun();
	}
}