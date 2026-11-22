import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=nre Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rem=0;
		int last=num%10;
		
		while(num>0){

			rem=num%10;
			num=num/10;
		}
		System.out.printl(rem);
		System.out.println(last);
	}
}