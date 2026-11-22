import java.util.*;
class AgeCheckException extends RuntimeException {

	AgeCheckException(String msg){

		super(msg);
	}
}
class Demo{


	static void Exc(){

		try{
		
			if(17<18){

				throw new AgeCheckException("age is less");
			}else{

				System.out.println("valid");
			}
		}catch(AgeCheckException e){

			System.out.println("catched");
		}
	}	
	public static void main(String[]args){

		Exc();
	}
}