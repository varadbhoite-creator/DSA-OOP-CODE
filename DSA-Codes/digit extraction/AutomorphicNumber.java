import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rem=0;
		int count=0;
		int power=1;
		int temp=num;
		int original=num;
		int i=1;

		while(temp>0){
			
			count++;
			temp=temp/10;
		}

		while(i<=count){

			power=power*10;
			i++;
		}
		
		int sqr=num*num;
		rem=sqr%power;
	
		if(rem==original){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}