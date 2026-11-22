import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks:");
		int marks=sc.nextInt();

		if(marks>60){
			System.out.println("admission confirmed , scholarship eligible");
		}else{
			System.out.println("waiting list");
		}
	}
}