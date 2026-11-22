import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int n=sc.nextInt();
		int num=1;

		for(int i=1;i<=n-1;i++){
		
			for(int j=1;j<=n;j++){

				if(i%2!=0){
					System.out.print(num);
					num++;
				}else{
					num--;
					System.out.print(num);
				}				
			}
			num=num+n;
			System.out.println();
		}
	}
}