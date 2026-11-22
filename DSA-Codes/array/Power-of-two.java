import java.util.*;
class Demo{
	
	static Boolean solution(int n){

		Boolean power=true;
		int rem=0;
	
		while(n>1){

			rem=n%2;
			n=n/2;

			System.out.println(rem);
			System.out.println(n);
		}
		
		if(n==1 && rem==0){

			return power;
		}else{

			power=false;
			return power;
		}
	}

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		
		System.out.println(solution(n));
	}	
}