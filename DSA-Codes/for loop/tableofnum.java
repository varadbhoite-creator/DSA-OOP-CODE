import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int n=10;
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int mult=0;

		for(int i=1;i<=n;i++){
			mult=num*i;
			System.out.println(mult);
		}
	}
}