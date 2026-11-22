import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int rem=0;

		while(n!=1 && n>9){

			int sum=0;
	
			while(n>0){

				rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			n=sum;
		}
		if(n==1){

			System.out.println("magic num");
		}else{

			System.out.println("not magic");
		}
	}
}