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
		
		while(i<=position){
	
			rem=num%10;
			num=num/10;
			i++;
		}
		System.out.println(rem);
	}
}