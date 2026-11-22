import java.util.*;
class Demo{

	static void solution(int n){

		int num=10;
		int num1=num;
		int count=2;
		int temp=3;

		for(int i=1;i<=n;i++){

			for(int j=1;j<=i;j++){

				if(i==count){

					System.out.print(num1+" ");
					num1=num1+10;
				}else{

					System.out.print("*"+" ");
				}
			}
			System.out.println();
			if(i==count){

				count=count+temp;
				temp++;
				num1=num+10;
				num=num+10;
			}
		}
	}

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		
		solution(n);
	}
}