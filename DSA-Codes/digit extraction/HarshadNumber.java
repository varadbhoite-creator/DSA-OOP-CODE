import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		int original=num;

		while(num>0){

			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(original%sum==0){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}