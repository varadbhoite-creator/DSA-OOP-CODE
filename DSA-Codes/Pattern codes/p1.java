import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num1=1;
		int num2=(n-1)*4;
		
		for(int i=1;i<=n;i++){

			for(int j=1;j<=n;j++){

				if(i==1 || j==n){

					System.out.print(num1);
					num1++;
				}else if(j==1 || i==n){

					System.out.print(num2);
					num2--;
				}else{

					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}