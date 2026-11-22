import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		sb=sb.reverse();
		String rev=sb.toString();
		System.out.println(rev.equals(s));
	}
}