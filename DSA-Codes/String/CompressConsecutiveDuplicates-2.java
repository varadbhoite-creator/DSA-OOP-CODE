import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		StringBuffer sb=new StringBuffer();
		sb.append(s.charAt(0));

		for(int i=1;i<len;i++){

			char ch=s.charAt(i);
			if(ch!=s.charAt(i-1)){

				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
}