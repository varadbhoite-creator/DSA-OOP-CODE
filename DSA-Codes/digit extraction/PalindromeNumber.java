import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rem=0;
		int rev=0;
		int original=num;

		while(num>0){

			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==original){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}