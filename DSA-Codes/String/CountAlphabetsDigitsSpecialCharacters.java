import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String sh=sc.next();
		int len=sh.length();
		int a=0;
		int d=0;
		int s=0;
		
		for(int i=0;i<len;i++){

			char ch=sh.charAt(i);
	
			if(Character.isLetter(ch)){

				a++;
			}else if(Character.isDigit(ch)){

				d++;
			}else{

				s++;
			}
		}
		System.out.println(a);
		System.out.println(d);
		System.out.println(s);
	}
}