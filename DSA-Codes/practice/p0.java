import java.util.*;
class Demo{

	
	static void solution(int n){

		for(int i=1;i<=n;i++){

			int num=1;

			for(int j=1;j<n+i;j++){

				if(j>n-i){

					if(j<n){

						System.out.print(num);
						num++;
					}else{

						System.out.print(num);	
						num--;
					}
				}else{

					System.out.print(" ");
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