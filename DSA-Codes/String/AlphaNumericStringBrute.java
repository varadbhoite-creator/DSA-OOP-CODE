import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		Boolean yes=false;
	
		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			yes=false;
			
			if(ch>='a' && ch<='Z' || ch>=0 && ch<=9){

				yes=true;
			}
			if(yes==false){

				break;
			}
		}
		System.out.println(yes);
	}
}