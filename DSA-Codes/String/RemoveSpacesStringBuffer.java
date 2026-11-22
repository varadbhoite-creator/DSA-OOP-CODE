import java.util.*;
class Demo{

	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		int len=s.length();
		StringBuffer sb=new StringBuffer();

		for(int i=0;i<len;i++){

			if(s.charAt(i)!=' '){

				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}