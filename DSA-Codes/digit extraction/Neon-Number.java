import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int sqr=n*n;
		int rem=0;
		int sum=0;
	
		while(sqr>0){

			rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
		}
		
		if(n==sum){

			System.out.println("Neon	");
		}else{

			System.out.println("Not Neon");
		}
	}
}