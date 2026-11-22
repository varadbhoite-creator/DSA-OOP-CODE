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
		int s1len=s1.length();
		String rev="";
		for(int j=s1len-1;j>=0;j--){

			rev=rev+s1.charAt(j);
		}
		System.out.println(rev.equals(s1));
	}
}