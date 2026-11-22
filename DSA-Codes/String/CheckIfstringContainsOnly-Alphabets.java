import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=sc.next();
		int len=s.length();
		Boolean isalphabets=true;

		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			if(ch<65 || ch>122){

				isalphabets=false;
				break;
			}
		}
		System.out.println(isalphabets);
	}
}