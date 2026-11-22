import java.util.*;
class Demo{

	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rem=0;
		int product=1;
	
		while(num>0){

			rem=num%10;
			product=product*rem;
			num=num/10;
		}
		System.out.println(product);
	}
}