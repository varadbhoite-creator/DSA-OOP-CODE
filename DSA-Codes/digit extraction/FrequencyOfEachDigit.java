import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int count=0;
		int rem=0;
		int a=0;
		int temp=n;

		while(a<=9){

			n=temp;
			while(n>0){

				rem=n%10;
				if(rem==a){

					count++;
				}
				n=n/10;
			}
			if(count>0){
				System.out.println(""+a+":"+count);
			}
			count=0;
			a++;
		}
	}
}