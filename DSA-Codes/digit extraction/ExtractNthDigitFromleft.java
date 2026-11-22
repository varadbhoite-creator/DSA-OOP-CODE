import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		System.out.println("Enter position:");
		int position=sc.nextInt();
		int rem=0;
		int i=1;
		int rev=0;

		while(num>0){
	
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		while(i<=position){
	
			rem=rev%10;
			rev=rev/10;
			i++;
		}
		System.out.println(rem);
	}
}