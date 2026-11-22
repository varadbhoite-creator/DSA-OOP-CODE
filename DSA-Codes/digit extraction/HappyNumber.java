import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rem=0;	
		int sum=0;
		int sqr=0;
		
		while(num>1 && num!=4){

			while(num>0){

				rem=num%10;
				sqr=rem*rem;
				sum=sum+sqr;
				num=num/10;
					
			}
			
			num=sum;
			sum=0;
			sqr=0;
		}
		
		if(num==1){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}