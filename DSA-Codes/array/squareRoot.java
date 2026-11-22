import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();	
		int i=1;
		int num=0;

		while(i<n){

			num=n/i;
			int sqr=num*num;
			if(sqr==n){

				System.out.println(num);
				break;
			}
			i++;
		}
	}
}