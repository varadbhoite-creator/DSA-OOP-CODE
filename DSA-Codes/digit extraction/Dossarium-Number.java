import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int count=0;
		int temp=n;
		int og=n;

		while(temp>0){

			count++;
			temp=temp/10;
		}
		int rem=0;
		int sum=0;
		
		while(n>0){

			rem=n%10;
			int i=1;
			int mult=1;

			while(i<=count){

				mult=mult*rem;
				i++;
			}
			sum=sum+mult;
			count--;
			n=n/10;
			
		}

		if(og==sum){

			System.out.println("dissarium");
		}else{

			System.out.println("not dissarium");
		}
	}
}