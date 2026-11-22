import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rem=0;
		int fact=1;
		int sum=0;
		int i=1;
		int original=num;

		while(num>0){

			rem=num%10;
			while(i<=rem){

				fact=fact*i;
				i++;
			}
			i=1;
			sum=sum+fact;
			fact=1;	
			num=num/10;
		}
		if(sum==original){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}