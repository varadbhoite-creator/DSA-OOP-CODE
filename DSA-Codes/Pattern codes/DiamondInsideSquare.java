import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int mid=(n/2)+1;
		int num1=1;
		int num2=3;
	
		for(int i=1;i<=n;i++){

			for(int j=1;j<=n;j++){

				if(i<=mid){

					if(i+j<=mid+1 || i+j>=mid+num1 || i==mid && j==mid){

						System.out.print("*");
					}else{

						System.out.print(" ");
					}

				}else{

					if(i+j<=mid+num2 || i+j>=n+mid){

						System.out.print("*");
					}else{

						System.out.print(" ");
					}
				}
			}
			if(i<=mid){

				num1=num1+2;
			}else{

				num2=num2+2;
			}			
			System.out.println();
		}
	}
}