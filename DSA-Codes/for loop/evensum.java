import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();	
		int sum=0;

		for(int i=1;i<=n;i++){
			if(i%2==0){
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}