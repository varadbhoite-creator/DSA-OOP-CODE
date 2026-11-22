import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a salary:");
		int salary=sc.nextInt();
		System.out.println("enter a score:");
		int score=sc.nextInt();

		if(salary>25000){
			if(score>=800){
				System.out.println("loan approved");
			}else{
				System.out.println("score is less");
			}
		}else{
			System.out.println("loan rejected");
		}
	}
}