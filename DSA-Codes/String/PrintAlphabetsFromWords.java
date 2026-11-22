import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();

		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			if(ch>='a' && ch<='z'){

				System.out.print(ch);
			}
		}
	}
}