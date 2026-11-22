import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		int i=0;
		int j=len-1;
		Boolean ispalindrome=true;

		while(i<j){

			if(s.charAt(i)!=s.charAt(j)){

				ispalindrome=false;
				break;
			}
			i++;
			j--;
		}
		if(ispalindrome){
			System.out.println("palindrome");
		}else{
			System.out.println("not palidrome");
		}
	}
}