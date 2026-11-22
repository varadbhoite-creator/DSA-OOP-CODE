import java.util.*;
class AgeCheckException extends Exception{


}
class Demo{
	
	public static void main(String[]args){

		if(19<18){

			throw new AgeCheckException();
		}else{

			System.out.println("valid");
		}
	}
}