import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		char ch='A';

		for(int i=1;i<n*2;i++){
		
			ch='A';		
			for(int j=1;j<=n;j++){

				if(i<=n){

					if(i+j>=2*i){

						System.out.print(ch);
						ch++;
					}else{

						System.out.print(" ");
					}
				}else{

					if(i+j>=2*n){

						System.out.print(ch);
						ch++;
					}else{

						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}