import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a exp:");
		int exp=sc.nextInt();
		System.out.println("Enter a salary:");
		int salary=sc.nextInt();
		

		if(exp>=3){
			if(salary>=40000){
				System.out.println("bonus eligible");
			}else{
				System.out.println("less salary");
			}
		}else{
			System.out.println("not eligible");
		}
	}
}