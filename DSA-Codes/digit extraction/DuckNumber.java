import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int rem=0;
		Boolean isfound=false;
	
		while(num>0){

			rem=num%10;
			if(rem==0){
			
				isfound=true;
				break;
			}
			num=num/10;
		}
		if(isfound){
			System.out.println(isfound);
		}else{
			System.out.println(isfound);
		}
	}
}