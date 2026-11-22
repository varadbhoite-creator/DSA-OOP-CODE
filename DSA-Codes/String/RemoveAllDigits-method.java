import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Ener String:");
		String s=sc.next();
		int len=s.length();
		StringBuffer sb=new StringBuffer();

		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			if(Character.isLetter(ch)){

				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
}