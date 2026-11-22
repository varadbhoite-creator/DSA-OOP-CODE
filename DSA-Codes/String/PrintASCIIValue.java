import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=s.length();
		
		for(int i=0;i<len;i++){
		
			int value=s.charAt(i);
			System.out.println(value);
		}
	}
}