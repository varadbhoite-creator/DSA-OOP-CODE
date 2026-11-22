import java.util.*;
class Demo{

	public static void  main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rev=0;
		int rem=0;
	
		while(num>0){

			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		int sum=0;	
		int count=0;
		while(rev>0){

			rem=rev%10;
			count++;
			if(count%2!=0){

				sum=sum+rem;
			}else{
	
				sum=sum-rem;
			}
			rev=rev/10;
		}
		System.out.println(sum);
	}
}