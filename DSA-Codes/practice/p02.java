import java.util.*;
class Demo{

	static void solution(int n){

		int k=1;

		for(int i=1;i<=n;i++){

			for(int j=1;j<=i;j++){

				if(j%2!=0){

					System.out.print(k);
					k++;
				}else{

					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		solution(n);
	}
}