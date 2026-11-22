import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		char a=65;

		for(int i=1;i<=n;i++){

			for(int j=1;j<n*2;j++){

				if((i+j)>n && (i+j)<n+i*2){

					if(j<n){

						System.out.print(a);
						a++;
					}else{

						System.out.print(a);
						a--;
					}
				}else{

					System.out.print(" ");
				}
			}
			a=65;
			System.out.println();
		}
	}
}      
