import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();

		if(num%5==0 && num%11==0){

			System.out.println("Divisible by 5&11");
		}else{

			System.out.println("not Divisible 5 & 11");
		}
	}
}