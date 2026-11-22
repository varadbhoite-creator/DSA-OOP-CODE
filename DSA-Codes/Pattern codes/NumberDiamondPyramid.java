import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int num=1;
		int sum=2;

		for(int i=1;i<n*2;i++){

			for(int j=1;j<n*2;j++){

				if(i<=n){

					if((i+j)>n && (i+j)<n+i*2){

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
				}else{

					if((i+j)>n+sum && (i+j)<n*3){

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
			}
			num=1;
			System.out.println();
			if(i>n){

				sum=sum+2;
			}
		}
	}
}