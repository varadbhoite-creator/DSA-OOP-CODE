import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rem=0;
		int last=num%10;
		
		while(num>0){

			rem=num%10;
			num=num/10;
		}
		int first=rem;
		System.out.println(first);
		System.out.println(last);
	}
}