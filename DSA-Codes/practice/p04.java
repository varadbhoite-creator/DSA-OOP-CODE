import java.util.*;
class Demo{

	static void solution(int n){

		for(int i=1;i<=n;i++){

			for(int j=1;j<=n;j++){

				if(i>1 && i<n){

					if(i==j || i+j==n+1){

						System.out.print("*");
						
					}else{

						System.out.print(i*j);
						
					}
				}else{

					System.out.print(i*j);	
					
				}
			}
			System.out.println();
		}
	}
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);


		int n=sc.nextInt();

		solution(n);
	}
}