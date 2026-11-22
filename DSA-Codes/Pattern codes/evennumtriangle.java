import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("Enter num");
		int num=sc.nextInt();
		for(int i=1;i<=n;i++){

			for(int j=1;j<=i;j++){

				System.out.print(num);
			}
			num=num+2;
			System.out.println();
		}
	}
}