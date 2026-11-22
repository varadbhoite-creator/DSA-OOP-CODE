import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int s1len=s1.length();
		int s2len=s2.length();
		int len=s1len-s2len;
		Boolean issuffix=true;
		int j=0;

		for(int i=len;i<s1len;i++){

			if(s1.charAt(i)!=s2.charAt(j)){

				issuffix=false;
				break;
			}
			j++;
		}
		System.out.println(issuffix);
	}	
}	
		
	
	