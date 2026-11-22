import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){

			if(num%i==0){

				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}