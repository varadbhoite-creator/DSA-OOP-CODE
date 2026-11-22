import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1:");
		String s1=sc.next();
		System.out.println("Enter String s2:");
		String s2=sc.next();
		boolean issubsequence=true;

		for(int i=0;i<s1.length();i++){

			char ch=s1.charAt(i);
			if(s2.indexOf(ch)==-1){

				issubsequence=false;
				break;
			}
		}
		System.out.println(issubsequence);
	}
}