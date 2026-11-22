import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		String rev="";
		
		for(int i=len-1;i>=0;i--){

			rev=rev+s.charAt(i);
		}
		System.out.println(rev.equals(s));
	}
}