import java.util.*;
class Demo{

	public static void  main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rem1=0;
		int rem2=0;
		int num1=num;
		Boolean increase=true;
	
		while(rem2>0){

			rem1=num%10;
			rem2=num%100;
	
			if(rem1<rem2){

				increase=false;
				break;
			}
			num=num/10;
			num1=num;
		}	
		System.out.println(increase);
	}
}