import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int sum=2;
		char a=65;
		
		for(int i=0;i<n*2;i++){

			for(int j=1;j<n*2;j++){

				if(i<=n){

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
				}else{

					if((i+j)>n+sum && (i+j)<n*3){

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
			}
			System.out.println();
			a=65;
			if(i>n){

				sum=sum+2;
			}
		}
	}
}