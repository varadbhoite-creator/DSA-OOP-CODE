import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rem=0;
		int count=0;
		int temp=num;
		int i=1;
		int product=1;
		int sum=0;
		int original=num;
		
		while(temp>0){

			count++;
			temp=temp/10;
		}
		while(num>0){

			rem=num%10;
			while(i<=count){

				product=product*rem;
				i++;
			}
			num=num/10;
			i=1;
			sum=sum+product;
			product=1;
		}
		if(sum==original){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}