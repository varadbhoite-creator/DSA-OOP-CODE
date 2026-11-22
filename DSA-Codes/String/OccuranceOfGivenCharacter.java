import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		String s=sc.next();
		int len=s.length();
		System.out.println("Enter character:");
		char target=sc.next().charAt(0);
		int count=0;

		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			if(ch==target){

				count++;
			}
		}
		System.out.println(count);
	}
}