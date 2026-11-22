import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int num=sc.nextInt();

		for(int i=1;i<=n;i++){

			for(int j=1;j<=num;j++){

				if(i==1 || j==1 || i==n || j==num){

					System.out.print("*");
				}else{

					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}