import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int sum=1;

		for(int i=1;i<=n;i++){

			for(int j=1;j<=n*4-2;j++){

				if((i+j)>n && (i+j)<n+i*2 || (i+j)>=n*3 && (i+j)<n*3+sum){

					System.out.print("*");
				}else{

					System.out.print(" ");
				}
			}
			sum=sum+2;
			System.out.println();
		}
	}
}