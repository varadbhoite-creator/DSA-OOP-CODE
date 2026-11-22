import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a age:");
		int age=sc.nextInt();
		boolean available=true;

		if(age>=18){
			if(available){
				System.out.println("booking confirmed");
			}else{
				System.out.println("not available");
			}
		}else{
			System.out.println("not allowed");
		}
	}
}