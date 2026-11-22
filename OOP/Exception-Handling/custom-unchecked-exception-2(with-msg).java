import java.util.*;
class AgeCheckException extends RuntimeException {

	AgeCheckException(String msg){

		super(msg);
	}
}
class Demo{


	static void Exc(){

		if(19<18){

			throw new AgeCheckException("varad");
		}else{

			System.out.println("catched");
		}
	}
	
	public static void main(String[]args){

		Exc();
	}
}