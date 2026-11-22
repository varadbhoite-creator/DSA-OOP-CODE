import java.util.*;
class Demo{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int mult=0;
	
		for(int i=1;i<=n;i++){
	
			for(int j=1;j<=10;j++){
				mult=i*j;
				System.out.println(mult);
			}
			System.out.println("----------");
		}
	}
}