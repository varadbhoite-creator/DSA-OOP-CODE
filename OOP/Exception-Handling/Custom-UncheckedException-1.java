
import java.util.*;
class AgeChechException extends RuntimeException{



}
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();

		if(age<18){

			throw new AgeChechException();
		}else{

			System.out.println("valid");
		}
	}
}