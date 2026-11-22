import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		if(age>=18){
			System.out.println("can vote");
		}else{
			System.out.println("cant vote");
		}
	}
}