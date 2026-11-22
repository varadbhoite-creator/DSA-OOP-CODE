import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();	
		int rem=0;
		int target=3;
		int count=0;
	
		while(num>0){

			rem=num%10;
			if(rem==target){

				count++;	
			}
			num=num/10;
		}
		System.out.println(count);
	}
}