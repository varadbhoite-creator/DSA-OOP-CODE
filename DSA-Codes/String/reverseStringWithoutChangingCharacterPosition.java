import java.util.*;
class Demo{

	static String solution(String s){

		int len=s.length();
		String rev="";

		for(int i=len-1;i>=0;i--){

			rev=rev+s.charAt(i);
		}
		return rev;
	}

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
	
		System.out.println(solution(s));
	}
}