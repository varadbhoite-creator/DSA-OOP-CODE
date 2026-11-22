import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String S1:");
		String s1=sc.nextLine();
		System.out.println("Enter String S2:");
		String s2=sc.nextLine();

		Boolean isequal=s1.equals(s2);
		System.out.println(isequal);	
	}
}