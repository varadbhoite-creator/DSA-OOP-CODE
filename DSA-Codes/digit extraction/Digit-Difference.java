import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int rem=0;
	
		while(num>0){

			rem=num%10;
			if(rem>max){

				max=rem;
			}
			if(rem<min){

				min=rem;
			}
			num=num/10;
		}
		System.out.println(max-min);
	}
}