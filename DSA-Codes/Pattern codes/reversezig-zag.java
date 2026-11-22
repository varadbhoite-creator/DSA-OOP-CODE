import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();

		for(int i=n;i>0;i--){
			int num=i;
			for(int j=1;j<=i;j++){


				System.out.print(num);
				num--;
			}
			System.out.println();
		}
	}
}