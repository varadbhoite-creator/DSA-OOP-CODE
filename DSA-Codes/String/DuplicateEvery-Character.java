import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		String s1="";

		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			s1=s1+ch+ch;
		}	
		System.out.println(s1);	
	}
}