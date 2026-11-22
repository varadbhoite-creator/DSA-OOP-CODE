import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1:");
		String s1=sc.next();
		System.out.println("Enter String s2:");
		String s2=sc.next();
		int len=s2.length();
		Boolean isprefix=true;

		for(int i=0;i<len;i++){

			if(s1.charAt(i)!=s2.charAt(i)){

				isprefix=false;
				break;
			}
		}
		System.out.println(isprefix);
	}
}