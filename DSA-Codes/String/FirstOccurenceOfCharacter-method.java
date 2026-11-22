import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		System.out.println("Enter character:");
		char ch=sc.next().charAt(0);
		
		int index=s.indexOf(ch);
		System.out.println(index);
	}
}