import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int count=0;
	
		if(num==0){
		
			count++;
		}
		while(num>0){

			count++;
			num=num/10;

		}
		System.out.println(count);
	}
}