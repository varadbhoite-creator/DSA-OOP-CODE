import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int num=3;

		for(int i=1;i<n*2;i++){

			for(int j=1;j<=n*2;j++){

				if(i<=n){

					if((i+j)==i+1 || (i+j)==n*2+1 || (i+j)== i*2 || (i+j)==n*2+i){

						System.out.print("*");
					}else{

						System.out.print(" ");
					}
				}else{

						if((i+j)==i+1 || (i+j)==n*2 || (i+j)== n*2+num || (i+j)==n*2+i){

							System .out.print("*");
						}else{

							System.out.print(" ");
						}
				}
			}
			System.out.println();
			if(i>n){

				num=num+2;
			}
		}
	}
}