import java.util.*;
class Demo{

	static void solution(int n){

		int count=1;
		int temp=2;
		int temp1=3;
		int num=10;
		int num1=num;

		for(int i=1;i<=n;i++){

			for(int j=1;j<n+count;j++){

				if(i==temp){

					if((i+j)>=n+1 && (i+j)%2==0){

						System.out.print(num1+" ");
						num1=num1+10;	
					}else{

						System.out.print(" "+" ");
					}
				}else{

					if((i+j)>=n+1 && (i+j)%2==0){

						System.out.print("*"+" ");
					}else{

						System.out.print(" "+" ");
					}
				}
			}
			System.out.println();
			if(i==temp){

				temp=temp+temp1;
				temp1++;
				num1=num+10;
				num=num+10;
			}
			count=count+1;
		}
	}

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		
		solution(n);
	}
}