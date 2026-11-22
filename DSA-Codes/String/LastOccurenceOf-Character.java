import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		System.out.println("Enter character:");
		char ch=sc.next().charAt(0);
		int len=s.length();

		for(int i=len-1;i>=0;i--){

			if(ch==s.charAt(i)){

				System.out.println(i);
				break;
			}
		}
	}
}