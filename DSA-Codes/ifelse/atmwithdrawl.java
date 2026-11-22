import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a balance:");
		int bal=sc.nextInt();
		System.out.println("Enter a amount:");
		int amu=sc.nextInt();

		if(bal>=5000){
			if(amu<2500){
				System.out.println("transaction successful");
			}else{
				System.out.println("transaction failed");
			}
		}else{
			System.out.println("amount less");
		}			
	}
}