import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		s=s.toLowerCase();
		int slen=s.length();
		String s1="";

		for(int i=0;i<slen;i++){

			char ch=s.charAt(i);
			if(ch>='a' && ch<='z'){

				s1=s1+ch;
			}
		}
		StringBuffer sb=new StringBuffer(s1);
		sb=sb.reverse();
		String rev=sb.toString();
		System.out.println(rev.equals(s1));
	}
}